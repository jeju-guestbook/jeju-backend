package com.goorm.jejubackend.data.dao;

import com.goorm.jejubackend.data.entity.GeneratedPost;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface GeneratedPostRepository extends Repository<GeneratedPost, Long> {

    void save(GeneratedPost generatedPost);

    List<GeneratedPost> findAll();
}
