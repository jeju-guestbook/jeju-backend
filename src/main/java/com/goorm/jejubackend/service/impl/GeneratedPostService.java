package com.goorm.jejubackend.service.impl;

import com.goorm.jejubackend.data.dto.GeneratedPostResponseDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class GeneratedPostService {

    public GeneratedPostResponseDto generate(final Map<String, Long> request) {
        return new GeneratedPostResponseDto();
    }

    public GeneratedPostResponseDto getGeneratedPost() {
        return new GeneratedPostResponseDto();
    }

    public List<GeneratedPostResponseDto> getGeneratedPostList() {
        return new ArrayList<>();
    }
}
