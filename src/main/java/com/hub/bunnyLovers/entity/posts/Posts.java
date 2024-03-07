package com.hub.bunnyLovers.entity.posts;

import com.hub.bunnyLovers.application.util.CommonUtils;
import com.hub.bunnyLovers.entity.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Getter
@NoArgsConstructor
@Table(name = "post")
@Entity
public class Posts extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private Long id;

	private String title;

	@Lob
	private String content;

	private String fileDir;

	private String delYn;

	private Long viewCount;

	@Column(length = 45, nullable = false)
	@Comment("등록자")
	private String createdUser;

	public void updateFieldsIfNotNull(String title, String content) {
		this.title = CommonUtils.getOrElse(title, this.title);
		this.content = CommonUtils.getOrElse(content, this.content);
	}

	@Builder
	public Posts(String title, String content, String createdUser) {
		this.title = title;
		this.content = content;
		this.createdUser = createdUser;
		this.delYn = "N";
		this.viewCount = 0L;
	}

}
