package com.example.service1;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIConfiguration {

	@Bean
	
	public RouteLocator getwayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p->p.path("/department/**")
							.uri("lb://DEPARTMENTSERVICE"))
				.route(p->p.path("/users/**")
							.uri("lb://USERSERVICE"))
				.build();
	}
	
	
}
