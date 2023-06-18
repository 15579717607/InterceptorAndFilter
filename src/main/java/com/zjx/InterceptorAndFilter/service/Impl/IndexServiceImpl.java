package com.zjx.InterceptorAndFilter.service.Impl;

import com.zjx.InterceptorAndFilter.service.IndexService;
import org.springframework.stereotype.Service;

/**
 * @author ZJX
 * @date 2023/6/18
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public String index() {
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println("==========================");
        return null;
    }
}
