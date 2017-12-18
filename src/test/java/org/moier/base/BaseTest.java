package org.moier.base;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.moier.config.SpringConfig;
import org.moier.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 上午11:02 2017/12/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@WebAppConfiguration("src/main/resources")
public class BaseTest {

    protected MockMvc mockMvc;

    @Autowired
    private DemoService demoService;


    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private MockHttpSession mockHttpSession;

    @Autowired
    private MockHttpServletRequest request;



    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }







}
