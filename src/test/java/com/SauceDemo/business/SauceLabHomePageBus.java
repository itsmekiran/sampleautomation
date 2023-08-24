package com.SauceDemo.business;

import com.SauceDemo.generic.CommonOperation;
import com.SauceDemo.generic.ExcelLib;
import com.SauceDemo.generic.ResourceReader;

public class SauceLabHomePageBus {

    public void loginpage(){

        CommonOperation.fillByXpath("inputTextBox", ExcelLib.getExcelData(CommonOperation.currentClass,0,1));
        CommonOperation.fillByXpath("passwordTextBox", ExcelLib.getExcelData(CommonOperation.currentClass,0,2));
        CommonOperation.clickByXpath("loginBtn");
    }
    public void verifylink(){}

    public void verifyaddtocart(){

    }
}
