package com.hub.bunnyLovers.application.post;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewCountService {

	private final StringRedisTemplate redisTemplate;

	public void incrementViewCount(Long id) {
		ValueOperations<String, String> valueOps = redisTemplate.opsForValue();
		valueOps.increment("post:viewCount:" + id);
	}

	
}
