package com.genericClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataClass {

	//Creating below method to fetch data every time from properties file:
	public String fetchProperty(String key) {
		Properties properties = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/DWS.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = properties.getProperty(key);
		return value;
	}

	
	
	//Creating below method to fetching the excel data:
	public String fetchDataFromExcel(String sheet, int rowNum, int cellNum) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./test-resources/DWSData.xslx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = workbook.getSheet(sheet).getRow(rowNum).getCell(cellNum).toString();
		return data;
	}

	public int getNumberofRows(String sheet) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./test-resources/DWSData.xslx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int data = workbook.getSheet(sheet).getPhysicalNumberOfRows();
		return data;
	}

	public int getNumberofCells(String sheet) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./test-resources/DWSData.xslx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int data = workbook.getSheet(sheet).getRow(0).getPhysicalNumberOfCells();
		return data;
	}

}