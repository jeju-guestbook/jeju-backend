package com.goorm.jejubackend.web;

import com.goorm.jejubackend.data.dto.GeneratedPostResponseDto;
import com.goorm.jejubackend.data.dto.GuestBookRequestDto;
import com.goorm.jejubackend.data.dto.GuestBookResponseDto;
import com.goorm.jejubackend.service.GuestBookService;
import com.goorm.jejubackend.service.impl.GeneratedPostService;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GuestBookController {

    private final GuestBookService guestBookService;
    private final GeneratedPostService generatedPostService;

    @GetMapping("/guestbook/{page}")
    public List<GuestBookResponseDto> getGuestBookDescBy12(@PathVariable Integer page) {
        return guestBookService.getList(page);
    }

    @PostMapping("/write")
    public GuestBookResponseDto createGuestBook (
        @RequestBody GuestBookRequestDto guestBookRequestDto
    ){
        return guestBookService.save(guestBookRequestDto);
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
