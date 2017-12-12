package org.moier.aop.service;

import org.moier.aop.annotations.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:47 2017/12/11
 */
@Service
public class DemoAnnotationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoAnnotationService.class);

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @Action(name = "sayHello")
    public String sayHello(String person) {
        String result = person + " say hello world";
        LOGGER.debug("book author {}", this.bookAuthor);
        LOGGER.debug("book name {}", this.bookName);
        LOGGER.debug("person = {}",person);
        return result;
    }
}
