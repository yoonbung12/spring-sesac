package com.sesac.sesacspring.mapper;

import com.sesac.sesacspring.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.Date;
import java.util.List;

@Mapper
public interface BoardMapper {

    // xml파일 읽어오기
    @Select("select * from board")
    List<Board> getAll();

//    @Select("select * from board where id = #{id}")
//    Board getBoardById(int id);


}
