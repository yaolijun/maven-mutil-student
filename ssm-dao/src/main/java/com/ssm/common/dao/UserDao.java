package com.ssm.common.dao;

import com.ssm.common.dao.base.BaseDao;
import com.ssm.common.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by yaolijun on 2017/10/11.
 */
@Repository
public interface UserDao extends BaseDao<User> {

    User selectUserById(Integer userId);
}
