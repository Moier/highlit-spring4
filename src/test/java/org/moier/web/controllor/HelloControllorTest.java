package org.moier.web.controllor;

import org.junit.Test;
import org.moier.base.BaseTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * HelloControllor Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十二月 18, 2017</pre>
 */
public class HelloControllorTest extends BaseTest {


    /**
     * Method: sayHello()
     */



    @Test
    public void testSayHello() throws Exception {
        mockMvc.perform(get("/hello/say"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
        .andExpect(forwardedUrl("/WEB-INF/classes/views/index.jsp"));

    }

} 
