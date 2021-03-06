package com.yykjc.jiaochendemo.user.dao;

import com.yykjc.jiaochendemo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content")Map map);

    void delById(Integer id);

    public void save(UserEntity userEntity);

    public UserEntity getUserById (Integer id);

    public void updataUserById(UserEntity userEntity);
}
