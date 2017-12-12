package org.moier.di.service;


import org.moier.aop.service.DemoAnnotationService;
import org.moier.aop.service.DemoMethodService;
import org.moier.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * UseFunctionService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十二月 11, 2017</pre>
 */
public class UseFunctionServiceTest {



    public static void main(String[] args){
        AnnotationConfigApplicationContext ano = new AnnotationConfigApplicationContext(SpringConfig.class);
        UseFunctionService useFunctionService = ano.getBean(UseFunctionService.class);
        useFunctionService.invokeFunctionMethod();
        //
        System.out.println("开始测试拦截器");

        DemoAnnotationService demoAnnotationService = ano.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = ano.getBean(DemoMethodService.class);
        demoAnnotationService.sayHello("zhang san");
        demoMethodService.sayHalo();
    }



} 
