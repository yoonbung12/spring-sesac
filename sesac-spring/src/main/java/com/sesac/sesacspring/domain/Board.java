package com.sesac.sesacspring.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Getter @Setter
public class Board {

    private int no;
    private String title;
    private String content;
    private String writer;
    private Date registered;
}
