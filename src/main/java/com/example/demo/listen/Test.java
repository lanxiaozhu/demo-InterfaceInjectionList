package com.example.demo.listen;

import com.example.demo.listen.server.Cache;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

/**
 * @Auther: wishm
 * @Date: 2019/5/25 23:12
 * @Description: 搞成组件
 */
@Component
public class Test implements ServletContextListener {


    @Resource
    private List<Cache> cacheList;

    /**
     * 初始化
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("-------初始化-------");
        for (Cache cache : cacheList) {
            System.out.println(cache.getCacheData());
        }
    }


}
