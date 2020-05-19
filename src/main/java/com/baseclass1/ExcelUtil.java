package com.baseclass1;



	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtil {
		FileInputStream fil;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		public int getRowCount(String Xlpath,String Sheet) throws IOException {
			File fs = new File(Xlpath);
			fil =  new FileInputStream(fs);
			workbook=new XSSFWorkbook(fil);
			sheet=workbook.getSheet(Sheet);
			int rowcnt = sheet.getLastRowNum();
			
			return rowcnt;
		}
		
		public int getcellCount(String Xlpath,String Sheet,int rownum) throws IOException {
			File fs = new File(Xlpath);
			fil =  new FileInputStream(fs);
			workbook=new XSSFWorkbook(fil);
			sheet=workbook.getSheet(Sheet);
			row= sheet.getRow(rownum);
			int cellcount = row.getLastCellNum();
			return cellcount;
		}
			
}
