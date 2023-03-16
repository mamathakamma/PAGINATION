package com.example.pagination.service;

import com.example.pagination.dto.PostDto;
import com.example.pagination.dto.PostResponse;

public interface PostService {
	
	PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
