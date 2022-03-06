package com.lemon.testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


//Log4j 级别由高到低： Error Warn Infor Bebug
public class Log4jTest {
    //日志对象初始化
    private Logger logger=Logger.getLogger(Log4jTest.class);

    @Test
    public void test(){
        //要通过log4j来记录日志
        logger.error("这是错误级别的日志");
        logger.warn("这是警告级别的日志");
        logger.info("这是一般提示信息级别的日志");
        logger.debug("这是调试级别的日志");

    }
}
