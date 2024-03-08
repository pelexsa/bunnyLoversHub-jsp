package com.hub.bunnyLovers.repository.file;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FileRepositoryImpl implements FileRepositoryCustom {

	private final JPAQueryFactory query;
	private final EntityManager entityManager;

}
