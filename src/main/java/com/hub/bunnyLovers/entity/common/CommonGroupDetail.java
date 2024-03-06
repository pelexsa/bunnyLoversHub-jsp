package com.hub.bunnyLovers.entity.common;

import com.hub.bunnyLovers.entity.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "common_group")
public class CommonGroupDetail extends BaseTimeEntity {

	@Id
	@Column(name = "code", nullable = false)
	private String code;

	@Column(nullable = false, length = 30)
	private String name;

	@Column(nullable = false, length = 1)
	private String useYn;

	@Column(length = 45, nullable = false)
	@Comment("등록자")
	private String createdUser;

	@Column(length = 45)
	@Comment("수정자")
	private String modifiedUser;

	private LocalDateTime createdDate;

	private LocalDateTime modifiedDate;

}
