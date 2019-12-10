package cn.itstudies.user.service;

import cn.itstudies.user.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Farewell is well
 * @date 2019-12-10 13:47
 */
public interface UserService {
    @PostMapping("/user/login")
    User userLogin(@RequestParam("username") String username,@RequestParam("password") String password);
}
