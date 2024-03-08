package com.hub.bunnyLovers.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Value("${resource.handler}")
	private String resourceHandler;
	@Value("${resource.locations}")
	private String resourceLocations;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(resourceHandler)
			.addResourceLocations(resourceLocations)
			.setCachePeriod(10);
	}
	
}
