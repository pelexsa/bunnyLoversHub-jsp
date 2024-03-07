package com.hub.bunnyLovers.entity.common;

import com.hub.bunnyLovers.entity.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class CommonGroupDetail extends BaseTimeEntity {

	@Id
	private String code;

	@Column(length = 30, nullable = false)
	private String name;

	@ManyToOne
	@JoinColumn(name = "group_code")
	private CommonGroup commonGroup;

	@ColumnDefault("'N'")
	@Column(length = 1, nullable = false)
	private String useYn;

	@Column(length = 45, nullable = false)
	private String createdUser;

	@Column(length = 45)
	private String modifiedUser;

}
