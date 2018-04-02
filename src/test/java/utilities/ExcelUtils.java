package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet excelWSheet;
		private static XSSFWorkbook excelWBook;
		private static XSSFCell cell;
		private static XSSFRow row;
		private static String excelFilePath;
	
		/**
	+	 * This method is to set the File path and to open the Excel file, Pass
	+	    Excel Path and Sheetname as Arguments to this method
	+	 * @param path
	+	 * @param sheetName
	+	 */
		public static void openExcelFile(String path, String sheetName) {
			excelFilePath = path;
			try {
				File file = new File(path);
				FileInputStream ExcelFile = new FileInputStream(file);
				excelWBook = new XSSFWorkbook(ExcelFile);
				excelWSheet = excelWBook.getSheet(sheetName);
	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void setCellData(String value, int rowNum, int colNum) {
	 		try {
				if(excelWSheet.getPhysicalNumberOfRows() < rowNum) {
					System.out.println("row creation");
					row = excelWSheet.createRow(rowNum);
				}else {
					row = excelWSheet.getRow(rowNum);
				}
	 			
				row = excelWSheet.getRow(rowNum);
	 			cell = row.getCell(colNum);
	 			
				if(row == null) {
					row = excelWSheet.createRow(rowNum);
				}
				
	 			if (cell == null) {
	 				cell = row.createCell(colNum);
	 				cell.setCellValue(value);
	 				}
	 	 		}catch (Exception e) {
	 				e.printStackTrace();
	 				System.out.println("Failed to write data");
	 	 		}
	 	 	}
		
	 /**
	+	  * This method is to read the test data from the Excel cell, in this we are
	+	 passing parameters as Row num and Col num
	+	  * @param rowNum
	+	  * @param colNum
	+	  * @return
	+	  */
		public static String getCellData(int rowNum, int colNum) {
			try {
				row=excelWSheet.getRow(rowNum);
				cell = excelWSheet.getRow(rowNum).getCell(colNum);
				if(row==null) {
					row=excelWSheet.createRow(rowNum);
				}
				String cellData = cell.toString();
				return cellData;
			} catch (Exception e) {
				System.out.println("non existing cell");
			return "";
			}
}}
