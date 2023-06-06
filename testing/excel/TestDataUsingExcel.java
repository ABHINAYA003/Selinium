package com.example.testing.excel;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestDataUsingExcel {
	@Test(dataProvider="testData")
public void addMethod(double num1,double n2) throws IOException {
	double result=(num1+n2);
	System.out.println(result);
	ExcelUtility.updateExcel();
}
@DataProvider
public Object[][] testData() throws IOException{
	Object[][] data=ExcelUtility.readExcel();
	return data;
}
}
