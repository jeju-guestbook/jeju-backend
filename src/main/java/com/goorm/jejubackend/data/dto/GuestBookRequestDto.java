package com.goorm.jejubackend.data.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@ToString
public class GuestBookRequestDto {
    private LocalDate datetime;

    private String userText;
}
