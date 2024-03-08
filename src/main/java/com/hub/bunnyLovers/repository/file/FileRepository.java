package com.hub.bunnyLovers.repository.file;

import com.hub.bunnyLovers.entity.file.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long>, FileRepositoryCustom {

}
