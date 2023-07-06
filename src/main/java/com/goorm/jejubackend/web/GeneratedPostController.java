package com.goorm.jejubackend.web;

import com.goorm.jejubackend.data.dao.GeneratedPostRepository;
import com.goorm.jejubackend.data.dto.GeneratedPostResponseDto;
import com.goorm.jejubackend.service.GeneratedPostService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api")
public class GeneratedPostController {

    private final GeneratedPostService generatedPostService;
    private final GeneratedPostRepository generatedPostRepository;

    @GetMapping("/result")
    public GeneratedPostResponseDto getGeneratedPost() {
        return generatedPostService.getGeneratedPost();
    }

    @GetMapping("/results")
    public List<GeneratedPostResponseDto> getGeneratedPostList() {
        return generatedPostService.getGeneratedPostList();
    }
}
