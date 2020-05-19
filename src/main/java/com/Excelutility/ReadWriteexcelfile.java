package com.Excelutility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteexcelfile {
XSSFWorkbook workbook;
XSSFSheet sheet;
FileInputStream fil;
File fs;
XSSFRow row;
XSSFCell cell;
//To read and return the username
public  String excel_username(int a) throws IOException
{

FileInputStream fil = new FileInputStream(new File("C:\\Users\\shrik\\eclipse-workspace\\orangehrm\\src\\test\\resources\\Testdata\\Orangehrlogin.xlsx"));
XSSFWorkbook workbook = new XSSFWorkbook(fil);
XSSFSheet sheet=workbook.getSheet("Sheet1");
int count=sheet.getLastRowNum();
System.out.println(count);

XSSFRow row =sheet.getRow(a);
XSSFCell cell=row.getCell(0);
String un=cell.getStringCellValue();

   
return un;
}

 //To read and return the password
public  String excel_password(int b) throws IOException {

FileInputStream fil = new FileInputStream(new File("C:\\Users\\shrik\\eclipse-workspace\\orangehrm\\src\\test\\resources\\Testdata\\newlinkedin.xlsx"));
XSSFWorkbook workbook = new XSSFWorkbook(fil);
XSSFSheet sheet=workbook.getSheet("Sheet1");
int count=sheet.getLastRowNum();
System.out.println(count);

XSSFRow row =sheet.getRow(b);
XSSFCell cell1=row.getCell(1);
String pwd=cell1.getStringCellValue();

return pwd;
}
public int getRowCount(String Xlpath,String Sheet) throws IOException {
fs = new File(Xlpath);
System.out.println("get row count");
fil = new FileInputStream(fs);
workbook=new XSSFWorkbook(fil);
sheet=workbook.getSheet(Sheet);
int rowcnt = sheet.getLastRowNum();
System.out.println(rowcnt);
return rowcnt;
}

public int getcellCount(String Xlpath,String Sheet,int rownum) throws IOException {
fs = new File(Xlpath);
fil =  new FileInputStream(fs);
workbook=new XSSFWorkbook(fil);
sheet=workbook.getSheet(Sheet);
row = sheet.getRow(rownum);
int cellcount = row.getLastCellNum();
return cellcount;
}

public String getCelldata(String Xlpath,String Sheet,int rownum,int colnum) throws IOException {
fil=new FileInputStream(Xlpath);
System.out.println("getcelldata");
workbook=new XSSFWorkbook(fil);
sheet=workbook.getSheet(Sheet);
row=sheet.getRow(rownum);
cell = row.getCell(colnum);
String data;
try 
{
DataFormatter formatter = new DataFormatter();
   String cellData = formatter.formatCellValue(cell);
   return cellData;
}
catch (Exception e) 
{
data="";
}
workbook.close();
fil.close();
return data;

}
}




