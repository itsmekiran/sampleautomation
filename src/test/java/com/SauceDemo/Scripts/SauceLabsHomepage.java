package com.SauceDemo.Scripts;

import com.SauceDemo.business.SauceLabHomePageBus;
import com.SauceDemo.generic.CommonOperation;
import com.SauceDemo.generic.ResourceReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLabsHomepage {
   // Run through firefox

    SauceLabHomePageBus bus = new SauceLabHomePageBus();

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        CommonOperation.currentClass="SauceLabsHomepage";
        CommonOperation.implementAskUser();
        bus.loginpage();
    }

    @BeforeMethod
    public void beforemethod() throws InterruptedException {

    }

    @Test
    public void verifylinkclickable(){
        bus.verifylink();
    }

    @Test
    public void addToCart(){}

    @AfterTest
    public void afterTest(){
        bus.logout();
    }
}
