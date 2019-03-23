package tk.mybatis.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.springboot.model.User;

import java.util.List;

@Mapper
public interface UserMapper{
    List<User> selectAll();
}
