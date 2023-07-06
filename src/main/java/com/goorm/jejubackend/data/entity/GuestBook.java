package com.goorm.jejubackend.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.goorm.jejubackend.data.entity.base.BaseEntity;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class GuestBook extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @Column(nullable = false)
    private LocalDateTime photoCreatedAt;

    @Column(nullable = false)
    private String s3ImgUrl;

    @Column(nullable = false)
    private String userText;
}
