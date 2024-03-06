package com.hub.bunnyLovers.api.posts.request;

import lombok.Getter;

@Getter
public class PostUpdateRequest {

	private Long postId;
	private String title;
	private String content;

}
