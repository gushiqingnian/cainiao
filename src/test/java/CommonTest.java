import org.junit.Test;
import tk.mybatis.springboot.model.User;
import tk.mybatis.springboot.service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class CommonTest {

    @Resource
    private UserService userService;

    @Test
    public void test(){
       List<User> users =  userService.selectAll();
       System.out.println(users);
    }
}
