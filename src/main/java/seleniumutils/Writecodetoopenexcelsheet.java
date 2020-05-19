package seleniumutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class Writecodetoopenexcelsheet {
	XSSFCell cell; 
	@Test
      public void orangehrmexcel() throws IOException {
    // How to read Excel files using Apache poi	
		File fil =new File("C:\\Swati\\Excel\\orangehrmlogin.xlsx"); 
				
		FileInputStream fis = new 	FileInputStream(fil);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("rowcount:"+sheet.getLastRowNum());
		int colNum = row.getLastCellNum();
		System.out.println("Cellcount:"+colNum);
	//	String Data=sheet.getRow(0).getCell(0).getStringCellValue();
	//		System.out.println(Data);
	//		String Data1=sheet.getRow(0).getCell(1).getStringCellValue();
	//		System.out.println(Data1);
	//		String Data2=sheet.getRow(1).getCell(0).getStringCellValue();
	//		System.out.println(Data2);
	//	    String Data3=sheet.getRow(1).getCell(1).getStringCellValue();
	//		System.out.println(Data3);
	//		String Data4=sheet.getRow(2).getCell(0).getStringCellValue();
	//		System.out.println(Data4);
	//		String Data5=sheet.getRow(2).getCell(1).getStringCellValue();
	//		System.out.println(Data5);
	//		String Data6=sheet.getRow(3).getCell(0).getStringCellValue();
	//		System.out.println(Data6);
	//		String Data7=sheet.getRow(3).getCell(1).getStringCellValue();
	//		System.out.println(Data7);
	//		String Data8=sheet.getRow(4).getCell(0).getStringCellValue();
	//			System.out.println(Data8);
	//		String Data9=sheet.getRow(4).getCell(1).getStringCellValue();
	//		System.out.println(Data9);
		
			for(int i=0;i<rowcount;i++) {
				
				for(int j=0;j<colNum;j++) {
					cell= sheet.getRow(i).getCell(j);
					cell.setCellType(CellType.STRING); 
				String Data=sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(Data);
					
				}
				// create cell in excell
				FileOutputStream foutput = new FileOutputStream(fil);
				sheet.getRow(i+1).createCell(colNum).setCellValue("Data imported");
				
								
				
				workbook.write(foutput);
				fis.close();
									
				
				
						
				
			}		
      }

	
}
