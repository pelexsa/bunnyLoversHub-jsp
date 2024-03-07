package com.hub.bunnyLovers.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class CacheConfig {

	@Bean
	public CacheManager cacheManager() {
//		ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager();
//		cacheManager.setAllowNullValues(false);
//		cacheManager.setCacheNames(List.of("commonGroup"));
//		return cacheManager;
		return new ConcurrentMapCacheManager("codeCache");
	}

}
