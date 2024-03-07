package com.hub.bunnyLovers.api.util;

import com.hub.bunnyLovers.application.file.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequiredArgsConstructor
@RequestMapping("/util")
public class UtilController {

	private final FileService fileService;

	@PostMapping("/file-upload")
	public void fileUpload(@RequestParam("files") MultipartFile[] files,
		@RequestParam("path") String path) throws Exception {
		fileService.fileUpload(files, path);
	}


}
