package com.goorm.jejubackend.data.dao;

import com.goorm.jejubackend.data.entity.GeneratedPost;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class GeneratedPostRepositoryTest {

    @Autowired
    private GeneratedPostRepository generatedPostRepository;

    @BeforeAll
    public void setUp() {
        IntStream.range(0, 10).mapToObj(i -> new GeneratedPost()).forEach(generatedPost -> {
            generatedPost.setS3ImgUrl("http://www.jejuweekly.com/news/photo/201708/5469_10214_3812.jpg");
            generatedPost.setGeneratedText("성산 일출봉에서 직접 찍은 다람쥐에요 귀엽죠?");
            generatedPostRepository.save(generatedPost);
        });
    }
}
