package com.goorm.jejubackend.data.dao;

import com.goorm.jejubackend.data.entity.GuestBook;

public interface GuestBookRepository {

    GuestBook insertGuestBook(GuestBook guestBook);

    GuestBook selectGuestBookList(Integer page);

}
