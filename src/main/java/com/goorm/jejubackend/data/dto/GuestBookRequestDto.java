package com.goorm.jejubackend.data.dto;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class GuestBookRequestDto {
    private Long book_id;

    private LocalDate datetime;

    private String userText;

    private Double x;

    private Double y;

    private byte[] image;
}
