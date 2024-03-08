package com.hub.bunnyLovers.api.util;

import com.hub.bunnyLovers.application.file.FileService;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequiredArgsConstructor
@RequestMapping("/util")
public class UtilController {

	private final FileService fileService;

	@PostMapping("/file-upload")
	@ResponseBody
	public Map<String, Object> fileUpload(@RequestParam("files") MultipartFile[] files,
		@RequestParam("path") String path) throws Exception {
		String url = fileService.fileUpload(files, path);

		Map<String, Object> result = new HashMap<>();
		result.put("url", url);
		return result;
	}

}
