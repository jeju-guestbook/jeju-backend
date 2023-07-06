package com.goorm.jejubackend.service;

import com.goorm.jejubackend.data.dto.GuestBookRequestDto;
import com.goorm.jejubackend.data.dto.GuestBookResponseDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GuestBookService {

    public List<GuestBookResponseDto> getList(final Integer page) {
        return new ArrayList<>();
    }

    public GuestBookResponseDto save(final GuestBookRequestDto guestBookRequestDto) {
        return new GuestBookResponseDto();
    }
}
