package com.goorm.jejubackend.data.dao;

import com.goorm.jejubackend.data.entity.GeneratedPost;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.core.io.ClassPathResource;

@DataJpaTest
class GeneratedPostRepositoryTest {

//    @Autowired
//    private GeneratedPostRepository generatedPostRepository;
//
//    @BeforeAll
//    public void setUp() throws IOException {
//        ClassPathResource cpr = new ClassPathResource("images/yourImage.jpg");
//        byte[] imageBytes = Files.readAllBytes(cpr.getFile().toPath());
//
//        IntStream.range(0, 10).mapToObj(i -> new GeneratedPost()).forEach(generatedPost -> {
//            generatedPost.setImage(imageBytes);
//            generatedPost.setGeneratedText("성산 일출봉에서 직접 찍은 다람쥐에요 귀엽죠?");
//            generatedPostRepository.save(generatedPost);
//        });
//    }
}
