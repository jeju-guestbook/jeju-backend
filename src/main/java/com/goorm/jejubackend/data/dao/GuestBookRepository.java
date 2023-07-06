package com.goorm.jejubackend.data.dao;

import com.goorm.jejubackend.data.entity.GuestBook;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface GuestBookRepository extends Repository<GuestBook, Long> {

    void save(GuestBook guestBook);

    List<GuestBook> findAll();
}
