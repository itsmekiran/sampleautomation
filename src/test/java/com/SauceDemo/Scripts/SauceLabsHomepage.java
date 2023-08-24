package com.SauceDemo.Scripts;

import com.SauceDemo.business.SauceLabHomePageBus;
import com.SauceDemo.generic.CommonOperation;
import com.SauceDemo.generic.ResourceReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLabsHomepage {
   // Run through firefox

    SauceLabHomePageBus bus = new SauceLabHomePageBus();

    @BeforeTest
    public void beforeTest(){
        CommonOperation.currentClass="SauceLabsHomepage";
     //   ResourceReader.readBundle("com.SauceDemo.resourcesXpath.SauceLabsHomepage.properties");
    }

    @BeforeMethod
    public void beforemethod() throws InterruptedException {
        CommonOperation.implementAskUser();
        bus.loginpage();
    }

    @Test
    public void verifylinkclickable(){
        bus.verifylink();
    }

    @Test
    public void addToCart(){}
}
