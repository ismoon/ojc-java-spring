package com.oraclejava.mini.auth.mapper;

import com.oraclejava.mini.auth.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthMapper {
    User selectUserByUsername(@Param("username") String username);
}
