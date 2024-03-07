package com.hub.bunnyLovers.application.common;

import com.hub.bunnyLovers.application.common.response.CommonGroupResponse;
import com.hub.bunnyLovers.repository.common.CommonRepository;
import jakarta.annotation.PostConstruct;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CommonService {

	private final CommonRepository commonRepository;

//	@Caching(
//		cacheable = {
//			@Cacheable(value = "commonGroup")
//		},
//		put = {
//			@CachePut(value = "commonGroup")
//		}
//	)
//	public List<CommonGroupResponse> getCommonGroup() {
//		return commonRepository.getCommonGroup();
//	}

	@Cacheable(value = "codeCache", key = "'all'")
	public List<CommonGroupResponse> getCommonGroup() {
		return commonRepository.getCommonGroup();
	}

	@PostConstruct
	@CachePut(value = "codeCache", key = "'all'")
	//, key = "'all'"
	public List<CommonGroupResponse> test() {
		System.out.println("====================================");
		return commonRepository.getCommonGroup();
	}

//	@Cacheable(value = "codeCache", key = "#id")
//	public String getWelcomeMessage() {
//		return "환영합니다!";
//	}

}
