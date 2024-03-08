package com.hub.bunnyLovers.entity.file;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "file")
@Entity
public class FileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "file_id")
	private Long id;

	private String storedFileName;

	private String storedFileDir;

	private String originalFileName;

	private Long fileSize;

	private String createUser;

	@Builder
	public FileEntity(String storedFileName, String storedFileDir, String originalFileName,
		Long fileSize, String createUser) {
		this.storedFileName = storedFileName;
		this.storedFileDir = storedFileDir;
		this.originalFileName = originalFileName;
		this.fileSize = fileSize;
		this.createUser = createUser;
	}

}
