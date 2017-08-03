package com.xiaojiaya.service.user;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * Created by moon on 2017/8/2.
 */
@Service
public interface UserService {
    PageInfo getAll();

}
