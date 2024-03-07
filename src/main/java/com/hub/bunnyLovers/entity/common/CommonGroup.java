package com.hub.bunnyLovers.entity.common;

import com.hub.bunnyLovers.entity.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "common_group")
public class CommonGroup extends BaseTimeEntity {

	@Id
	@Column(name = "group_code", nullable = false)
	private String code;

	@Column(nullable = false, length = 30)
	private String name;

	@Column(nullable = false, length = 1)
	private String useYn;

	@Column(length = 45, nullable = false)
	private String createdUser;

	@Column(length = 45)
	private String modifiedUser;

}
