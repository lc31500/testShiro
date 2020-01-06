package com.mapper;

import com.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {


    public User findByUsername(String name);

    public User findById(Integer id);
}
