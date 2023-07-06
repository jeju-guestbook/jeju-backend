package com.goorm.jejubackend.data.dao;

import com.goorm.jejubackend.data.entity.GeneratedPost;
import java.util.List;

public interface GeneratedPostRepository {

    GeneratedPost insertGeneratedPost(GeneratedPost generatedPost);

    List<GeneratedPost> selectMyGeneratedPost(Long id);
}
