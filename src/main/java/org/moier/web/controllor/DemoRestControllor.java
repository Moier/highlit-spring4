package org.moier.web.controllor;

import org.moier.web.pojo.UserInfosVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:40 2017/12/14
 */
@RestController
@RequestMapping("/rest")
public class DemoRestControllor {


    @RequestMapping(value = "getJson",produces = {"application/json;charset=utf-8"})
    public UserInfosVO getUserInfoForJson(){
        UserInfosVO userInfosVO = new UserInfosVO();
        userInfosVO.setUserName("james blunt");
        userInfosVO.setPassword("u r beanutiful");
        return userInfosVO;
    }


    @RequestMapping(value = "getXml",produces = {"application/xml;charset=UTF-8"})
    public UserInfosVO getUserInfoForXml(){
        UserInfosVO userInfosVO = new UserInfosVO();
        userInfosVO.setUserName("james blunt");
        userInfosVO.setPassword("u r beanutiful");
        return userInfosVO;
    }






}
