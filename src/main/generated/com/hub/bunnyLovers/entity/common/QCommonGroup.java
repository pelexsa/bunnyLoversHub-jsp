package com.hub.bunnyLovers.entity.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonGroup is a Querydsl query type for CommonGroup
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommonGroup extends EntityPathBase<CommonGroup> {

    private static final long serialVersionUID = 256916961L;

    public static final QCommonGroup commonGroup = new QCommonGroup("commonGroup");

    public final com.hub.bunnyLovers.entity.QBaseTimeEntity _super = new com.hub.bunnyLovers.entity.QBaseTimeEntity(this);

    public final StringPath code = createString("code");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath createdUser = createString("createdUser");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath modifiedUser = createString("modifiedUser");

    public final StringPath name = createString("name");

    public final StringPath useYn = createString("useYn");

    public QCommonGroup(String variable) {
        super(CommonGroup.class, forVariable(variable));
    }

    public QCommonGroup(Path<? extends CommonGroup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonGroup(PathMetadata metadata) {
        super(CommonGroup.class, metadata);
    }

}

