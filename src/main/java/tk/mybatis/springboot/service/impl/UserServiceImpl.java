package tk.mybatis.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.dao.UserMapper;
import tk.mybatis.springboot.model.User;
import tk.mybatis.springboot.service.UserService;

import javax.annotation.Resource;
import java.util.List;

//@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll(){
//        return null;
        return userMapper.selectAll();
    }
}
