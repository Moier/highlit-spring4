package org.moier.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut(value = "@annotation(org.moier.aop.annotations.Action)")
    public void annotationPointCut() {
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Object args[] = joinPoint.getArgs();
        LOGGER.info("------------------------------------");
        LOGGER.info("the method of proxy {}",method.getName());
        LOGGER.info("the method args {}",Arrays.toString(args));


    }


    @AfterReturning(value = "annotationPointCut()",returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint,Object returnObj){

        LOGGER.info("the method return {}",returnObj);

    }


}
