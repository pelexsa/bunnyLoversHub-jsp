package com.hub.bunnyLovers.repository.post;

import com.hub.bunnyLovers.entity.posts.Posts;
import java.util.List;

public interface PostRepositoryCustom {

	public List<Posts> findPosts();

	public void deletePostById(Long id);

}
