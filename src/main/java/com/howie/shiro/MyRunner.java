package com.howie.shiro;
import	java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * ClassName: My <br/>
 * Description: <br/>
 * date: 2019/10/17 10:40<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("ok>>>>>>>>>>>>>>>>");
    }
}
