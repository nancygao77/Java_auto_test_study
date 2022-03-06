package com.lemon.pages;

import com.lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
  //  private WebDriver driver;
    //购物车里面的商品标题
    private By cartGoodTitle=By.xpath("//div[@class='activity-goods']//a[@class='name']");

    //商品价格
    private By cartGoodsPrice = By.xpath("//div[@class='unit-price']");

    //商品数量
    private  By cartGoodsNum=By.xpath("//input[@class='number']");

//    public CartPage(WebDriver driver){
//        this.driver=driver;
//
//    }
public CartPage(WebDriver driver){
    super(driver);

}
    public String getcartGoodTitle(){
        //return waitElementVisible(driver,cartGoodTitle).getText();

        return getElementText(cartGoodTitle,"购物车页面-商品标题");
    }
    public String getcartgoodsPrice(){
      //  return waitElementVisible(driver,cartGoodsPrice).getText().trim()//.trim()去掉空格;
       return getElementText(cartGoodsPrice,"购物车页面-商品价格").trim();//.trim()去掉空格
    }
    public String getcartGoodsNum(){
       // return waitElementVisible(driver,cartGoodsNum).getAttribute("value") ;//number没有在html里面显示，

        //number没有在html里面显示，
        //就要用.getAttribute("value")
        return getElementAttribute(cartGoodsNum,"value","购物车页面-商品数量") ;
    }


}
