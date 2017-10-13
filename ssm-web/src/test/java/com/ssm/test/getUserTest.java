package com.ssm.test;

import com.ssm.common.model.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by yaolijun on 2017/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class getUserTest {

    @Resource
    private UserService userService;

    @Test
    public void getUserTest() throws Exception {
        User user = userService.selectUserById(1);
        System.out.println(user.getUserId());
        System.out.println(user.getUserName());
        System.out.println(user.getUserEmail());
    }


}
