package com.hub.bunnyLovers.api;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCheckController {

	@GetMapping("/health-check")
	public String HealthCheck(Model model, HttpServletResponse response) {
		System.out.println(response);
		model.addAttribute("test", "hello");
		return "/hello";
	}

}
