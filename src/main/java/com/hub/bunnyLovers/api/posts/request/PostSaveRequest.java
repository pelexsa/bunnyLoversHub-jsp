package com.hub.bunnyLovers.api.posts.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class PostSaveRequest {

	private Long postId;

	@NotNull
	@NotEmpty
	private String title;

	@NotNull
	@NotEmpty
	private String content;

	private String createdUser;

}
