package com.sgtesting.excelassignassengmment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques7 {
     static String fruits[]= new String[21];
	public static void main(String[] args) {
		readContent();
		writeContent();
	
	}
	/*private static void rowtocolumn() 
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;

		Sheet sh=null;
		Sheet sh1=null;
		Row row=null;
		Row row1=null;
		Cell cell=null;
		Cell cell1=null;
		try
		{

			fin=new FileInputStream("E:\\EXCEL\\Ques7.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			sh1=wb.getSheet("Sheet2");
			if(sh1==null)
			{
				sh1=wb.createSheet("Sheet2");
			}
			int rc=sh.getPhysicalNumberOfRows();
			System.out.println(rc);
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				row1=sh1.getRow(10);
				if(row1==null)
				{
					row1=sh1.createRow(10);
				}
				int cc=row.getPhysicalNumberOfCells();
				System.out.println(cc);
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					if(cell1==null)
					{
						cell1=row.createCell(c);
					}
					String data=cell.getStringCellValue();
					cell1.setCellValue(data);
				}
					
			}
			fout=new FileOutputStream("E:\\EXCEL\\Ques7.xlsx");
			wb.write(fout);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{	
				fout.close();
				wb.close();
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}


	}*/
	private static void readContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\EXCEL\\Ques7.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int k=-1;
			for(int r=0;r<21;r++)
			{
				k=k+1;
				row=sh.getRow(r);
					cell=row.getCell(9);
					String data=cell.getStringCellValue();
					fruits[k]=data;	
				
				
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}


	private static void writeContent()
	{
		FileOutputStream fout=null;
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\EXCEL\\Ques7.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.createSheet("Sheet2");
			row=sh.createRow(9);
			for (int i=0;i<fruits.length;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue(fruits[i]);
			}
			fout=new FileOutputStream("E:\\EXCEL\\Ques7.xlsx");
			wb.write(fout);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
				fout.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}