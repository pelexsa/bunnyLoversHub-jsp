package com.hub.bunnyLovers.repository.post;

import com.hub.bunnyLovers.entity.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long>, PostRepositoryCustom {

}
