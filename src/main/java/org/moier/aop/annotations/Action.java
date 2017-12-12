package org.moier.aop.annotations;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:44 2017/12/11
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();
}
