package com.example.service1;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service1.valueObjects.ResponseTemplateVo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/users")
@EnableHystrix
public class UserController {

	Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String getHome() {
		return "User Home";
	}
	
	@GetMapping("/get")
	public List<User> getUsers(){
		logger.info("Inside User Controller getUsers");
		return service.getUsers();
	}
	
	@GetMapping("/get/{name}")
	@HystrixCommand(fallbackMethod = "userfallbackmethod")
	public ResponseTemplateVo getUserWithDepartment(@PathVariable("name")String name) {
		return service.getUserWithDepartment(name);
	}
	
	public ResponseTemplateVo userfallbackmethod(@PathVariable("name")String name) {
		logger.info("Inside Fallback method: Failure of Department Service");
		User user = service.getUser(name);
		ResponseTemplateVo responseTemplateVo = new ResponseTemplateVo();
		responseTemplateVo.setUser(user);
		return responseTemplateVo;
	}
}
