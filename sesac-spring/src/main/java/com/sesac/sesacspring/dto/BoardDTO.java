package com.sesac.sesacspring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@NoArgsConstructor
public class BoardDTO {

//    id int not null auto_increment primary key,
//    title varchar(20) not null,
//    content varchar(100) not null,
//    writer varchar(10) not null,
//    registered timestamp default current_timestamp on update current_timestamp

    private int no;
    private String title;
    private String content;
    private String writer;
    private Date registered;

}
