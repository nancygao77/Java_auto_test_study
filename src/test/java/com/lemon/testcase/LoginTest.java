package com.lemon.testcase;

import com.lemon.common.BaseTest;
import com.lemon.pages.IndexPage;
import com.lemon.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccess() {
        WebDriver driver = openBrowser("chrome");
        driver.get("http://mall.lemonban.com:3344/");

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickLogin();
        //实例化Loginpage对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("waiwai", "lemon123456");//每个操作都需要传个driver , 代码融于，
        //因此，引入有参构造函数
    }


    //利用dataprovider设计执行失败的用例
//    @Test(dataProvider="getFailDatas")
//    public void loginFail(String phone,String pwd) {
//        WebDriver driver = openBrowser("chrome");
//        driver.get("http://mall.lemonban.com:3344/");
//
//        IndexPage indexPage = new IndexPage(driver);
//        indexPage.clickLogin();
//        //实例化Loginpage对象
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login(phone, pwd);
//        //login fail 断言
//        loginPage.getTips();
//        Assert.assertEquals(loginPage.getTips(),"账号或密码不正确");
//    }
//
//    @DataProvider
//    public Object[][] getFailDatas() {
//        Object[][] datas = {{"18122224444", "123456"},
//                {"18122225555", "123456"},
//                {"18122226666", "123456"}};
//        return datas;
//    }
}
