package com.whatsmars.dubbo.service.impl;

import com.whatsmars.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by shenhongxi on 2017/12/4.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public boolean register(String name) {
        // register ...
        return true;
    }
}
