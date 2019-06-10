package com.example.demo.listen.server.impl;

import com.example.demo.listen.server.Cache;
import org.springframework.stereotype.Service;

/**
 * @Auther: wishm
 * @Date: 2019/5/25 23:29
 * @Description:
 */
@Service
public class FourCacheImpl implements Cache {
    @Override
    public int getCacheData() {
        return 4;
    }
}
