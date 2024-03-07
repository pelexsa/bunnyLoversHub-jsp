package com.hub.bunnyLovers.entity.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommonGroupDetail is a Querydsl query type for CommonGroupDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommonGroupDetail extends EntityPathBase<CommonGroupDetail> {

    private static final long serialVersionUID = 664245650L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommonGroupDetail commonGroupDetail = new QCommonGroupDetail("commonGroupDetail");

    public final com.hub.bunnyLovers.entity.QBaseTimeEntity _super = new com.hub.bunnyLovers.entity.QBaseTimeEntity(this);

    public final StringPath code = createString("code");

    public final QCommonGroup commonGroup;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath createdUser = createString("createdUser");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath modifiedUser = createString("modifiedUser");

    public final StringPath name = createString("name");

    public final StringPath useYn = createString("useYn");

    public QCommonGroupDetail(String variable) {
        this(CommonGroupDetail.class, forVariable(variable), INITS);
    }

    public QCommonGroupDetail(Path<? extends CommonGroupDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommonGroupDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommonGroupDetail(PathMetadata metadata, PathInits inits) {
        this(CommonGroupDetail.class, metadata, inits);
    }

    public QCommonGroupDetail(Class<? extends CommonGroupDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.commonGroup = inits.isInitialized("commonGroup") ? new QCommonGroup(forProperty("commonGroup")) : null;
    }

}

