package cn.itstudies.product.controller;

import cn.itstudies.user.mapper.UserMapper;
import cn.itstudies.user.pojo.User;
import cn.itstudies.user.pojo.UserExample;
import cn.itstudies.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 13:53
 */
@RestController
public class UserController implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User userLogin(String username, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        criteria.andDeletedEqualTo(new Byte("0"));
        List<User> users = userMapper.selectByExample(example);
        if (users.size() == 1) {
            return users.get(0);
        } else {
            return null;
        }
    }
}
