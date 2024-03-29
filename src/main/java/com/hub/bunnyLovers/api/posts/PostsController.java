package com.hub.bunnyLovers.api.posts;

import com.hub.bunnyLovers.api.posts.request.PostSaveRequest;
import com.hub.bunnyLovers.api.posts.request.PostUpdateRequest;
import com.hub.bunnyLovers.api.posts.response.PostTag;
import com.hub.bunnyLovers.application.common.CommonService;
import com.hub.bunnyLovers.application.common.response.CommonGroupResponse;
import com.hub.bunnyLovers.application.post.PostService;
import com.hub.bunnyLovers.application.post.ViewCountService;
import com.hub.bunnyLovers.entity.posts.Posts;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostsController {

	private final PostService postService;
	private final CommonService commonService;
	private final ViewCountService viewCountService;

	@GetMapping
	public String findPosts(Model model) {
		List<Posts> posts = postService.findPosts();
		model.addAttribute("posts", posts);
		return "posts/posts";
	}

	@GetMapping("/{id}")
	public String findPostById(@PathVariable("id") Optional<Long> id, Model model)
		throws Exception {
		// 게시물 없을때 처리
		Posts post = postService.findById(id);
		model.addAttribute("post", post);
		return "posts/post";
	}

	@GetMapping("/addPost")
	public String showAddPostForm(Model model) {
		List<CommonGroupResponse> commonGroup = commonService.getCommonGroup();
		List<PostTag> tags = commonGroup.stream()
			.filter(e -> e.getGroupCode().equals("POST_TAG"))
			.map(e -> {
				String code = e.getCode().replaceAll("POST_TAG_", "");
				return new PostTag(code, e.getName());
			})
			.toList();

//		model.addAttribute("post", new Post());
//  model.addAttribute("categories", Arrays.asList(
//      new Category(1, "일상"),
//      new Category(2, "취미"),
//      new Category(3, "IT")
//  ));

		model.addAttribute("tags", tags);
		return "posts/addPost";
	}

	@PostMapping("/addPost")
	public String addPost(PostSaveRequest postSaveRequest) {
		postSaveRequest.setCreatedUser("테스터");
		postService.addPost(postSaveRequest);
		return "redirect:/posts";
	}

	@PutMapping
	public ResponseEntity<Void> updatePost(@RequestBody PostUpdateRequest postUpdateRequest)
		throws Exception {
		postService.updatePost(postUpdateRequest);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePost(@PathVariable Long id) {
		postService.deletePostById(id);
		return ResponseEntity.ok().build();
	}

	@PostMapping("/{id}/view")
	public void incrementViewCount(@PathVariable Long id) throws Exception {
		viewCountService.incrementViewCount(id);
	}

}
