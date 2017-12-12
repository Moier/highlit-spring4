package org.moier.aop.service;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:49 2017/12/11
 */
@Service
public class DemoMethodService {

    public void sayHalo(){
        System.out.println("demoMethodService say hello world");
    }
}
