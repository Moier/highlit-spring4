package org.moier.aop.service;

import org.moier.aop.Action;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:47 2017/12/11
 */
@Service
public class DemoAnnotationService {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @Action(name = "sayHello")
    public String sayHello(String person) {
        String result = person + "say hello world";
        System.out.println(result);
        System.out.println("book author : "+bookAuthor);
        System.out.println("book name : "+bookName);
        return result;
    }
}
