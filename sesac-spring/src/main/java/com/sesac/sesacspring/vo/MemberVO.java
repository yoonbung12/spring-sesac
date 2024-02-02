package com.sesac.sesacspring.vo;

import lombok.Getter;

import java.util.Date;

@Getter
public class MemberVO {
    private String name;
    private String gender;
    private Date regdate;
    private String hobby;
}
