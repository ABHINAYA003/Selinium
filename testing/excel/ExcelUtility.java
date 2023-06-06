package com.example.testing.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
     
	public static Object[][] readExcel() throws IOException {
    	 String location="C:\\Users\\user 1\\Desktop\\exceltesting.xlsx";
    	 FileInputStream fis = new FileInputStream(location);
    	 //creating a work book object
    	 XSSFWorkbook workbook = new XSSFWorkbook(fis);
    	 //locating the sheets
    	 XSSFSheet sheet=workbook.getSheetAt(0);

    	 //getting total rows
    	 int total=sheet.getPhysicalNumberOfRows();
    	 System.out.println("Total number of rows: "+total);
    	 int column=sheet.getRow(0).getLastCellNum();
    	 System.out.println("Total columns: "+column);
    	 //creating the object 2d array
    	 
    	 Object[][]data= new Object[total-1][column];
    	 for(int i=1;i<total;i++) {
    		 XSSFRow row=sheet.getRow(i);
    		 for(int j=0;j<column;j++) {
    			 XSSFCell cell=row.getCell(j);
    			 data[i-1][j]=cell.getNumericCellValue();    	 
    	
    	 System.out.println(cell.getNumericCellValue());
    		 }
    	 }
    	 fis.close();
    	 workbook.close();
    	 return data;
     }
     public static void updateExcel() throws IOException{
    	 String location="C:\\Users\\user 1\\Desktop\\exceltesting.xlsx"; 
         FileInputStream fis = new FileInputStream(location);
         XSSFWorkbook workbook = new XSSFWorkbook(fis);
         //locating the sheets
    	 XSSFSheet sheet=workbook.getSheetAt(0);
    	 XSSFRow newRow=sheet.createRow(0);
    	 XSSFCell newCell=newRow.createCell(2);
    	 newCell.setCellValue("Updated");
    	 System.out.println("Document written successfully");
    	 FileOutputStream fos=new FileOutputStream(location);
    	 //fos.close();
    	 workbook.write(fos);
    	 workbook.close();
    	 fos.close();
    	 }
     
     }

