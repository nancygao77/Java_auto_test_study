package com.lemon.testcase;

import com.lemon.common.BaseTest;
import com.lemon.pages.CartPage;
import com.lemon.pages.GoodsDetailsPage;
import com.lemon.pages.IndexPage;
import com.lemon.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCarTest extends BaseTest {
    @Test
    public void addOneSuccess(){
       WebDriver driver= openBrowser("Chrome");
       toUrl("http://mall.lemonban.com:3344/");
       //1.登录
        GoodsDetailsPage goodsDetailsPage=new GoodsDetailsPage(driver);
        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickLogin();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("waiwai","lemon123456");
        //2.浏览商品
        indexPage.clickGoodList();
        indexPage.clickSelectedGoods();
        //做个断言
        //(1)商品标题
        String goodsTitle1=goodsDetailsPage.getgoodsTitle();
        //(2)商品价格
        String goodsPrice1=goodsDetailsPage.getgoodsPrice();
        //(3)商品数量
       String goodsNumber1=goodsDetailsPage.getgoodNum();
        //3.添加购物车
        goodsDetailsPage.clickAddCart();
        //4.点击购物车
        indexPage.ClickCart();
        //获取购物车里面的商品标题， （为了做断言）
        CartPage cartPage=new CartPage(driver);
        String goodsTitle2=cartPage.getcartGoodTitle();
        String goodsPrice2=cartPage.getcartgoodsPrice();
        String goodsNumber2=cartPage.getcartGoodsNum();
        //然后和GoodsDetailsPage的goodsTitle1做断言
//        Assert.assertEquals(goodsTitle2,goodsTitle1);
//        Assert.assertEquals(goodsPrice2,goodsPrice1);
//        Assert.assertEquals(goodsNumber2,goodsNumber1);
        myAssertEquals(goodsTitle2,goodsTitle1);
        myAssertEquals(goodsPrice2,goodsPrice1);
        myAssertEquals(goodsNumber2,goodsNumber1);



    }
}
