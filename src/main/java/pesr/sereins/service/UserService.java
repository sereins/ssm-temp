package pesr.sereins.service;

import pesr.sereins.pojo.User;

import java.util.List;

public interface UserService {

    public int addUser(User user);

    public int deleteById(int id);

    public int updateUser(User user);

    public User queryById(int id);

    public List<User> queryAll();
}
