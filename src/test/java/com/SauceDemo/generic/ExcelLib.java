package com.SauceDemo.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib extends CommonOperation{







    static String path = "C:\\Users\\kiran\\IdeaProjects\\sampleAutomationProject\\TestData";





  

    public static String getExcelData(String sheetName , int rowNum , int columnNum) {
        String data="";
        try{
            FileInputStream fis = new FileInputStream(path+"\\SeleniumTest.xls");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sh = wb.getSheet(sheetName);
            Row row = sh.getRow(rowNum);
            data = row.getCell(columnNum).getStringCellValue();
        }
        catch(Exception e){}

        return data;
    }













}





