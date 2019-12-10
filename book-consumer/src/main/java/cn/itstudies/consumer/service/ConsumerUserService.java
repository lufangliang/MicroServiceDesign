package cn.itstudies.consumer.service;

import cn.itstudies.user.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:37
 */
@FeignClient(value = "book-user-provider",fallbackFactory = ConsumerUserServiceFallback.class)
public interface ConsumerUserService {
    @PostMapping("/user/login")
    User userLogin(@RequestParam("username") String username, @RequestParam("password") String password);
}
