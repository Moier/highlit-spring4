package org.moier.web.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午9:42 2017/12/13
 */
@RequestMapping("/hello")
@Controller
public class HelloControllor {

    @RequestMapping("/say")
    public String sayHello(){
        return "index";
    }
}
