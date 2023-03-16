package com.example.pagination.dto;

import lombok.Data;

@Data
public class PostDto {
	private Long id;
	private String title;
	private String description;
	private String content;
	//private Set<CommentDto> comments;
}
/*

{
	"title":"java",
	"description":"java material",
	"conent":"about java"
}

{
	"title":"sql",
	"description":"sql material",
	"conent":"about sql"
}

{
	"title":"python",
	"description":"python material",
	"conent":"about python"
}



*/