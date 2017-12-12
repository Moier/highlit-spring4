package org.moier.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:31 2017/12/11
 */
@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;


    public void invokeFunctionMethod(){
        this.functionService.sayHello();
    }


}
