package com.SauceDemo.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CommonOperation {



    public static String choiceForBroswer="";

    static String path=System.getProperty("user.dir");
    static String url ="https://www.saucedemo.com/";
   public static String currentClass;

    public static void implementAskUser() throws InterruptedException{
       // ResourceReader.readBundle("com.SauceDemo.resourcesXpath."+CommonOperation.currentClass);
        ResourceReader.readBundle(CommonOperation.currentClass);



        System.out.println("The url opening is "+url);



            String[] choices = new String[]{"InternetExplorer", "MozillaFirefox","GoogleChrome"};
            String choice = askUser(choices);
            choiceForBroswer=choice;
            System.out.println(choiceForBroswer);
            if(choice.equalsIgnoreCase("MozillaFirefox")){


                Driver.driver = new FirefoxDriver();
                Driver.driver.manage().window().maximize();
              

                Driver.driver.get(url);

             //   ResourceReader.readBundle("com.SauceDemo.resourcesXpath."+CommonOperation.currentClass);
             //   ResourceReader.readBundle("com.SauceDemo.resourcesXpath.SauceLabsHomepage");

                //Driver.driver.findElement(By.id("zc_Textbox_0")).sendKeys("admin");

            }
            else if(choice.equalsIgnoreCase("InternetExplorer")){
                System.setProperty("webdriver.ie.driver", path+"\\sampleAutomationProject\\Driver_Server\\IEDriverServer.exe");
              

                Driver.driver.get(url);

                Driver.driver.manage().window().maximize();





            }

            else if(choice.equalsIgnoreCase("GoogleChrome")){
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("chrome.switches", Arrays.asList("--user-data-dir=C:/Users   /username/AppData/Local/Google/Chrome/User Data/Default"));

                System.setProperty("webdriver.chrome.driver", path+"\\sampleAutomationProject\\Driver_Server\\chromedriver.exe");

                Driver.driver.get(url);

                Driver.driver.manage().window().maximize();


            }
            System.out.println("selected: " + choice);
        }










    static String askUser(String[] choices) {

        String s = (String) JOptionPane.showInputDialog(
                null,
                "make your choice",
                "SELECT YOUR BROWSER",
                JOptionPane.PLAIN_MESSAGE,
                null,
                choices,
                choices[0]);
        return s;
    }

    public static void fillByXpath(String locator,String InputData) {

        try {

            WebDriverWait wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(40));

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ResourceReader.readValue(locator)))).sendKeys(InputData);
            implicitWait();
        } catch (Exception e) {


        }
    }


    public static void clickByXpath(String locator){


        try{
           	Driver.driver.findElement(By.xpath(ResourceReader.readValue(locator))).click();
                implicitWait();
        }
        catch(Exception e){


        }


        //	}
    }

    public static void implicitWait(){

        try{

            Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);

        }
        catch(Exception e){}
    }




}
