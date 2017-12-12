package org.moier.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:51 2017/12/11
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut(value = "@annotation(org.moier.aop.Action)")
    public void annotationPointCut() {
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Object args[] = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("拦截方法:" + method.getName());

    }


    @AfterReturning(value = "annotationPointCut()",returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint,Object returnObj){

        System.out.println("攔截方法返回的結果為："+returnObj);

    }


}
