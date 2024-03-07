package com.hub.bunnyLovers.repository.common;

import com.hub.bunnyLovers.application.common.response.CommonGroupResponse;
import com.hub.bunnyLovers.entity.common.QCommonGroup;
import com.hub.bunnyLovers.entity.common.QCommonGroupDetail;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommonRepositoryImpl implements CommonRepositoryCustom {

	private final JPAQueryFactory query;
	private final EntityManager entityManager;

	@Override
	public List<CommonGroupResponse> getCommonGroup() {
		QCommonGroup QCommonGroup = new QCommonGroup("c1");
		QCommonGroupDetail QCommonGroupDetail = new QCommonGroupDetail("c2");

		return query
			.select(Projections.bean(CommonGroupResponse.class,
				QCommonGroup.code.as("groupCode"),
				QCommonGroup.name.as("groupName"),
				QCommonGroupDetail.code,
				QCommonGroupDetail.name))
			.from(QCommonGroup)
			.join(QCommonGroupDetail)
			.on(QCommonGroup.code.eq(QCommonGroupDetail.commonGroup.code)
				.and(QCommonGroupDetail.useYn.eq("Y")))
			.where(QCommonGroup.useYn.eq("Y"))
			.fetch();
	}

}
