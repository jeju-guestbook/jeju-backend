package com.goorm.jejubackend.web;

import com.goorm.jejubackend.data.dao.GeneratedPostRepository;
import com.goorm.jejubackend.data.dao.GuestBookRepository;
import com.goorm.jejubackend.data.dto.GeneratedPostResponseDto;
import com.goorm.jejubackend.data.dto.GuestBookRequestDto;
import com.goorm.jejubackend.data.dto.GuestBookResponseDto;
import com.goorm.jejubackend.data.entity.GuestBook;
import com.goorm.jejubackend.service.GuestBookService;
import com.goorm.jejubackend.service.GeneratedPostService;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Blob;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.hibernate.Hibernate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GuestBookController {

    private final GuestBookService guestBookService;
    private final GeneratedPostService generatedPostService;
    private final GuestBookRepository guestBookRepository;
    private final GeneratedPostRepository generatedPostRepository;

    @GetMapping("/guestbook/{page}")
    public List<GuestBook> getGuestBookDesc(@PathVariable Integer page) {
        return guestBookRepository.findAll();
    }

    @PostMapping("/write")
    public Long createGuestBook(
        @RequestPart String datetime,
        @RequestPart String user_text,
        @RequestPart MultipartFile image
    ) throws IOException {
        GuestBook guestBook = new GuestBook();
        guestBook.setImage(image.getBytes());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        guestBook.setPhotoCreatedAt(LocalDate.parse(datetime, formatter));
        guestBook.setUserText(user_text);

        GuestBook saved = guestBookRepository.save(guestBook);
        return saved.getId();
    }

    @PostMapping("/upload")
    public GeneratedPostResponseDto uploadForGeneratedText(@RequestBody Map<String, Long> request) {
        Long guestbook_id = request.get("book_id");
        // 비동기적으로 처리
        // 1. 이미지 인식 서비스
        // 2. 텍스트 생성 서비스
        // 모두 완료되고 나면 리턴
        System.out.println(guestbook_id);
        return generatedPostService.generate(request);
    }
}
