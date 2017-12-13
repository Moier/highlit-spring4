package org.moier.di.service;


import org.junit.Test;
import org.moier.aop.service.DemoAnnotationService;
import org.moier.base.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UseFunctionService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十二月 11, 2017</pre>
 */

public class UseFunctionServiceTest extends BaseTest{



    @Autowired
    private DemoAnnotationService demoAnnotationService;


    @Test
    public void testSayHello() throws Exception{
        demoAnnotationService.sayHello("hhs ");

        try {
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



} 
