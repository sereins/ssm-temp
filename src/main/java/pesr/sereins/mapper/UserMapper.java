package pesr.sereins.mapper;

import org.apache.ibatis.annotations.Param;
import pesr.sereins.pojo.User;
import java.util.List;

public interface UserMapper {

    public int addUser(User user);

    public int deleteById(@Param("id") int id);

    public int updateUser(User user);

    public User queryById(@Param("id") int id);

    public List<User> queryAll();
}
