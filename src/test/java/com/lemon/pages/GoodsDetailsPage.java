package com.lemon.pages;

import com.lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoodsDetailsPage extends BasePage {
    //添加购物车元素
    private By addCart = By.linkText("加入购物车");
    //商品标题
    private By goodsTitle = By.xpath("//div[@class='name-box']//div[@class='name']");
    //商品价格
    private By goodsPrice = By.xpath("//div[@class='price-box']//div[@class='price']");
    //商品的数量
    private By goodNum = By.xpath("//input[@type='number']");
 //   private WebDriver driver;
//    public  GoodsDetailsPage(WebDriver driver){
//        this.driver=driver;
//
//    }
public GoodsDetailsPage(WebDriver driver){
    super(driver);

}

    public void clickAddCart() {
       // waitElementClickable(driver,addCart).click();
        click(addCart,"商品详情页-点击添加到购物车");


    }
    //获取商品标题操作
    public String getgoodsTitle(){//是有返回值的需要把void 改成返回的值的类型

        return getElementText(goodsTitle,"商品详情页-商品标题");

    }
    //获取商品价格
    public String getgoodsPrice(){

        //去掉换行符：.replaceAll("\n","");
        //拿到的商品价格：￥
        //0
        //.01
        //￥0.01
       return  getElementText(goodsPrice,"商品详情页-商品价格").replaceAll("\n","");
    }
    //通过getAttribute()获取数量值. 页面有文本值， 但是html 里面没有
    public String getgoodNum(){

        return getElementAttribute(goodNum,"vaule","商品详情页-商品数量");
    }

}