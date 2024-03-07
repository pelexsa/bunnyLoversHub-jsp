package com.hub.bunnyLovers.repository.post;

import com.hub.bunnyLovers.entity.posts.Posts;
import com.hub.bunnyLovers.entity.posts.QPosts;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepositoryCustom {

	private final JPAQueryFactory query;
	private final EntityManager entityManager;

	@Override
	public List<Posts> findPosts() {
		QPosts qPosts = new QPosts("q1");
		return query
			.selectFrom(qPosts)
			.where(qPosts.delYn.eq("N"))
			.fetch();
	}

	@Override
	public void deletePostById(Long id) {
		QPosts qPosts = new QPosts("q1");
		query
			.update(qPosts)
			.set(qPosts.delYn, "Y")
			.where(qPosts.id.eq(id))
			.execute();
	}

}
