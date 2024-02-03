package com.sesac.sesacspring.mapper;

import com.sesac.sesacspring.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    // sql문을 정의 or xml 파일을 읽거나

    // xml 파일을 읽어서 실행하겠다.
    List<User> retreiveAll();
}
