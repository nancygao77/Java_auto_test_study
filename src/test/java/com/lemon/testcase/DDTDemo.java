package com.lemon.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class DDTDemo {
   @Test(dataProvider = "getDatas")
    public void test(String phone,String pwd){
       System.out.println("手机号:"+phone+",密码:"+pwd);

   }
   @DataProvider
    public Object[][] getDatas(){
           Object[][] datas = {{"18122224444","123456"},
                   {"18122225555","123456"},
                   {"18122226666","123456"}};
           return datas;
       }

}
