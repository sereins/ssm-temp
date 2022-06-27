package pesr.sereins.service.impl;


import pesr.sereins.mapper.UserMapper;
import pesr.sereins.pojo.User;
import pesr.sereins.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    // service 调dao
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User queryById(int id) {
        return userMapper.queryById(id);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }


}
