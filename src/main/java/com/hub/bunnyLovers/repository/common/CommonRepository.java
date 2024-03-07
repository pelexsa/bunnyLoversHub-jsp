package com.hub.bunnyLovers.repository.common;

import com.hub.bunnyLovers.entity.common.CommonGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommonRepository extends JpaRepository<CommonGroup, Long>, CommonRepositoryCustom {

}
