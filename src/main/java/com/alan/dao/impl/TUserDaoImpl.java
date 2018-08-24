package com.alan.dao.impl;

import com.alan.dao.ITUserDao;
import com.alan.pojo.TUser;

public class TUserDaoImpl implements ITUserDao {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TUser record) {
        return 0;
    }

    @Override
    public int insertSelective(TUser record) {
        return 0;
    }

    @Override
    public TUser selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TUser record) {
        return 0;
    }
}
