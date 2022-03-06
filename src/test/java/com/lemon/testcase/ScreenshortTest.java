package com.lemon.testcase;

import com.lemon.common.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
//截图
//需要在pom文件中倒 commons-io 坐标
public class ScreenshortTest extends BaseTest {
    @Test
    public void test() throws InterruptedException, IOException {
       WebDriver driver= openBrowser("chrome");
        driver.get("https://www.baidu.com");
        Thread.sleep(2000);
        //截图 getScreenshotAs
        //driver.getScreenshotAs();
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir")+"\\target\\test.png");
        FileUtils.copyFile(srcFile,destFile);
     //  System.out.println(System.getProperty("user.dir")); 获取项目的根目录
        //J:\nimengban\web_project_36\target 项目根目录
    }

}
