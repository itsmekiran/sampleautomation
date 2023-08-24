package com.SauceDemo.business;

import com.SauceDemo.generic.CommonOperation;
import com.SauceDemo.generic.Driver;
import com.SauceDemo.generic.ExcelLib;
import com.SauceDemo.generic.ResourceReader;
import org.testng.Assert;

public class SauceLabHomePageBus {

    public void loginpage() throws InterruptedException {

        CommonOperation.fillByXpath("inputTextBox", ExcelLib.getExcelData(CommonOperation.currentClass,1,1));
        CommonOperation.fillByXpath("passwordTextBox", ExcelLib.getExcelData(CommonOperation.currentClass,1,2));
        CommonOperation.clickByXpath("loginBtn");
        Assert.assertEquals(Driver.driver.getTitle(),"Swag Labs");
    }
    public void verifylink(){
        CommonOperation.implicitWait();
        CommonOperation.clickByXpath("clicklink");
        Driver.driver.getTitle();
        System.out.println("The title is:::::"+Driver.driver.getTitle());
    }

    public void logout(){

        CommonOperation.clickByXpath("mainMenu");
        CommonOperation.clickByXpath("LogoutBtn");

    }
}
