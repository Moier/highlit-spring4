package org.moier.config;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:33 2017/12/11
 */
@Configuration
@ComponentScan(basePackages = {"org.moier"})
@EnableAspectJAutoProxy
@PropertySource("classpath:/test.properties")
@EnableScheduling
public class SpringConfig {



}
