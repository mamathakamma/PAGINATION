package com.example.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pagination.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
