package com.hub.bunnyLovers.application.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	@Value("${file.upload-dir}")
	private String uploadDir;

	public void fileUpload(MultipartFile[] files, String path) throws Exception {
		path = uploadDir + "/" + path;
		Path uploadPath = Paths.get(path);

		if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}

	}

}
