package com.goorm.jejubackend.web.generatedPost;

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

    @GetMapping("/result")
    public void getGeneratedPost() {

    }

    @GetMapping("/results")
    public void getGeneratedPostList() {

    }
}
