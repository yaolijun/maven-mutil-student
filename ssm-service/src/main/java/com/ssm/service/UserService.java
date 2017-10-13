package com.ssm.service;

import com.ssm.common.model.User;

/**
 * Created by yaolijun on 2017/10/13.
 */
public interface UserService {

    User selectUserById(Integer userId);
}
