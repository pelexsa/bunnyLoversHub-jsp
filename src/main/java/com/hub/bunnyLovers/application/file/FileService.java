package com.hub.bunnyLovers.application.file;

import com.hub.bunnyLovers.entity.file.FileEntity;
import com.hub.bunnyLovers.repository.file.FileRepository;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class FileService {

	@Value("${file.upload-dir}")
	private String uploadDir;

	private final FileRepository fileRepository;

	public String fileUpload(MultipartFile[] files, String path) throws Exception {
		String url = "";
		path = uploadDir + path;
		Path uploadPath = Paths.get(path);

		if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}

		for (MultipartFile file : files) {
			String originalFileName = file.getOriginalFilename();
			String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
			String storedFileName = UUID.randomUUID() + extension;

			Path filePath = uploadPath.resolve(storedFileName);
			file.transferTo(filePath.toFile());

			FileEntity fileEntity = FileEntity.builder()
				.storedFileName(storedFileName)
				.storedFileDir(path)
				.originalFileName(originalFileName)
				.fileSize(file.getSize())
				.createUser("user")
				.build();
			fileRepository.save(fileEntity);

			url = "/resources/image/post/" + storedFileName;
		}

		return url;
	}

}