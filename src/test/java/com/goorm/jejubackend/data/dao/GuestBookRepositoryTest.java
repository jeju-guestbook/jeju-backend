package com.goorm.jejubackend.data.dao;

import com.goorm.jejubackend.data.entity.GuestBook;
import java.time.LocalDateTime;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class GuestBookRepositoryTest {

//    @Autowired
//    private GuestBookRepository guestBookRepository;
//
//    @BeforeAll
//    public void setUp() {
//        IntStream.range(0, 10).mapToObj(i -> new GuestBook()).forEach(guestBook1 -> {
//            guestBook1.setPhotoCreatedAt(LocalDateTime.parse("2020-04-25T00:00:00"));
//            guestBook1.setS3ImgUrl("http://www.jejuweekly.com/news/photo/201708/5469_10214_3812.jpg");
//            guestBook1.setUserText("성산 일출봉에서 직접 찍은 다람쥐에요 귀엽죠?");
//            guestBookRepository.save(guestBook1);
//            GuestBook guestBook2 = new GuestBook();
//            guestBook2.setPhotoCreatedAt(LocalDateTime.parse("2020-04-25T00:00:00"));
//            guestBook2.setS3ImgUrl("http://www.jejuweekly.com/news/photo/201708/5469_10214_3812.jpg");
//            guestBook2.setUserText("내가 한라산에서 직접 찍은 다람쥐에요 귀엽죠?");
//            guestBookRepository.save(guestBook2);
//            GuestBook guestBook3 = new GuestBook();
//            guestBook3.setPhotoCreatedAt(LocalDateTime.parse("2020-04-25T00:00:00"));
//            guestBook3.setS3ImgUrl("http://www.jejuweekly.com/news/photo/201708/5469_10214_3812.jpg");
//            guestBook3.setUserText("내가 비자림에서 직접 찍은 다람쥐에요 귀엽죠?");
//            guestBookRepository.save(guestBook3);
//        });
//    }
}
