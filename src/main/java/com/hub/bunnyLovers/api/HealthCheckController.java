package com.hub.bunnyLovers.api;

import com.hub.bunnyLovers.application.common.CommonService;
import com.hub.bunnyLovers.application.common.response.CommonGroupResponse;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HealthCheckController {

	private final CommonService commonService;

	@GetMapping("/health-check")
	public String HealthCheck(Model model, HttpServletResponse response) {
		System.out.println(response);
		model.addAttribute("test", "hello");
		return "/hello";
	}

	@GetMapping("/test")
	public void test() {
		List<CommonGroupResponse> getCommonGroup = commonService.getCommonGroup();
		System.out.println("getCommonGroup = " + getCommonGroup);

	}

}
