package tk.mybatis.springboot.service;

import tk.mybatis.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
}
