package com.hub.bunnyLovers.entity.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonGroupDetail is a Querydsl query type for CommonGroupDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommonGroupDetail extends EntityPathBase<CommonGroupDetail> {

    private static final long serialVersionUID = 664245650L;

    public static final QCommonGroupDetail commonGroupDetail = new QCommonGroupDetail("commonGroupDetail");

    public final com.hub.bunnyLovers.entity.QBaseTimeEntity _super = new com.hub.bunnyLovers.entity.QBaseTimeEntity(this);

    public final StringPath code = createString("code");

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final StringPath createdUser = createString("createdUser");

    public final DateTimePath<java.time.LocalDateTime> modifiedDate = createDateTime("modifiedDate", java.time.LocalDateTime.class);

    public final StringPath modifiedUser = createString("modifiedUser");

    public final StringPath name = createString("name");

    public final StringPath useYn = createString("useYn");

    public QCommonGroupDetail(String variable) {
        super(CommonGroupDetail.class, forVariable(variable));
    }

    public QCommonGroupDetail(Path<? extends CommonGroupDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonGroupDetail(PathMetadata metadata) {
        super(CommonGroupDetail.class, metadata);
    }

}

