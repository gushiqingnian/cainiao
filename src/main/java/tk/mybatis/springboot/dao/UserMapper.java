package tk.mybatis.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.hibernate.validator.internal.engine.messageinterpolation.el.MapBasedFunctionMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.springboot.model.User;

import java.util.List;

//@Mapper
public interface UserMapper{
//    @Select("select * from tbl_user")
    List<User> selectAll();
}
