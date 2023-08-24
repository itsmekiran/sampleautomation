package com.SauceDemo.generic;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceReader {

    static ResourceBundle bundle;
    public static void readBundle(String value){
        bundle  = ResourceBundle.getBundle(value, Locale.US);

    }


    public static String  readValue(String element){
        String value =bundle.getString(element);

        return  value;

    }
}
