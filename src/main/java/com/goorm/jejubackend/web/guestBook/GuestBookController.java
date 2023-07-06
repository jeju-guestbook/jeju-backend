package com.goorm.jejubackend.web.guestBook;

import com.goorm.jejubackend.domain.guestBook.entity.GuestBook;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api")
public class GuestBookController {


    @GetMapping("/guestbook")
    public List<GuestBook> getGuestBookList(@RequestParam(name = "page", defaultValue = "1") String page) {
        List<GuestBook> guestBookArrayList = new ArrayList<GuestBook>();
        // 방명록 조회 서비스

        return guestBookArrayList;
    }

    @PostMapping("/write")
    public ResponseEntity<?> writeGuestBook (
        @Valid @RequestParam("guestbook_id") Long id,
        @Valid @RequestParam("datetime")LocalDateTime datetime,
        @Valid @RequestParam("image") MultipartFile image
    ) throws IOException {
        // 방명록 작성 서비스
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping("/upload")
    public Long uploadForGeneratedText(@RequestBody Map<String, Long> request) {
        Long guestbook_id = request.get("book_id");

        // 비동기적으로 처리
        // 1. 이미지 인식 서비스
        // 2. 텍스트 생성 서비스
        // 모두 완료되고 나면 리턴

        Long gen_id = 1L;
        return gen_id;
    }
}
