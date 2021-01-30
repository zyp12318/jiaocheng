package com.yykjc.jiaochendemo.user.service;

import com.yykjc.jiaochendemo.user.dao.UserDao;
import com.yykjc.jiaochendemo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserserviceImpl implements Userservice{
    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    //实现类实现接口的方法
    @Override
    public void save(UserEntity userEntity) {

        userEntity.setCreatetime(new Date());
        userEntity.setStauts(1);
        userDao.save(userEntity);
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updataUserById(UserEntity userEntity) {
        userDao.updataUserById(userEntity);
    }

}
