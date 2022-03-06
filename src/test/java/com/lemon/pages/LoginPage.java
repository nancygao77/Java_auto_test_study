package com.lemon.pages;

import com.lemon.common.BasePage;
import com.lemon.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //1.元素定位
    private By phone_input = By.xpath("//input[@placeholder='请输入手机号/用户名']");
    private By password_input = By.xpath("//input[@placeholder='请输入密码']");
    private By login_button = By.xpath("//a[@class='login-button']");
    //登录异常提示信息
    private By tips = By.xpath("//p[@class='el-message__content']");

  //  private WebDriver driver;
    //有参构造 所有
//    public LoginPage(WebDriver driver){
//
//        this.driver=driver;
    //上述报错的原因是因为之前是在每个页面当中对驱动做实例化的，现在LoginPage extends BasePage 可以通过
    //父类实例化， 可直接用super, 调用父类的构造函数
    public LoginPage(WebDriver driver){
        super(driver);//调用父类的构造函数

    }
    public String getTips(){
        return getElementText(tips,"登录页面-提示信息");
    }

//    }
    //2.登录操作
    public void login(String phone,String password){
//        driver.findElement(phone_input).sendKeys(phone);
//        driver.findElement(password_input).sendKeys(password);
//        driver.findElement(login_button).click();
//        waitElementVisible(driver,phone_input).sendKeys(phone);
//        waitElementVisible(driver,password_input).sendKeys(password);
//        waitElementClickable(driver,login_button).click();
        type(phone_input,phone,"登录页面-手机号输入框");
        type(password_input,password,"登录页面-密码输入框");
        click(login_button,"登录页面-密码输入框");

    }
}
