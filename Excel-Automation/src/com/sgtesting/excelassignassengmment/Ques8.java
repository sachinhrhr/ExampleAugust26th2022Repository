package com.sgtesting.excelassignassengmment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques8 {

	public static void main(String[] args) {
		DuplicateIn();
	}
	private  static void DuplicateIn()
	{
		FileInputStream fin=null;
		FileInputStream fin1=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Workbook wb1=null;
		Sheet sh=null;
		Row row=null;
		Row row1=null;
		Cell cell=null;
		Cell cell1=null;

		try
		{
			fin=new FileInputStream("E:\\EXCEL\\Test.xlsx");
			fin1=new FileInputStream("E:\\EXCEL\\Test1.xlsx");
			wb=new XSSFWorkbook(fin);
			wb1=new XSSFWorkbook(fin1);
			sh=wb.getSheet("Sheet1");
			Sheet sh1=wb1.getSheet("Sheet1");
			int q=sh.getPhysicalNumberOfRows();
			for(int i=0;i<q;i++)
			{
				row=sh.getRow(i);
				row1=sh1.getRow(i);
				for(int a=0;a<row.getPhysicalNumberOfCells();a++)
				{
					cell=row.getCell(a);
					cell1=row1.getCell(a);
				}
				String da=cell.getStringCellValue();
				cell1.setCellValue(da);
			}	
			fout=new FileOutputStream("E:\\EXCEL\\Test1.xlsx");

			wb1.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{	
			//	fout.close();
				wb.close();
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
