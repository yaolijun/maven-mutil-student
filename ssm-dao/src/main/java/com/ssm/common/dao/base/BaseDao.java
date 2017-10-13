package com.ssm.common.dao.base;

import java.util.List;

/**
 * Created by yaolijun on 2017/10/13.
 */
public interface BaseDao<T> {

    Boolean insert(T var);

    Boolean delete(T var);

    Boolean update(T var);

    List<T> select(T var);

}
