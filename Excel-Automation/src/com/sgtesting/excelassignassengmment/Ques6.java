package com.sgtesting.excelassignassengmment;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques6 {

	public static void main(String[] args) {
		readWriteContent();

	}
	private static void readWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row row1=null;
		Row row2=null;
		Cell cell1=null;
		Cell cell2=null;
		try
		{
			fin=new FileInputStream("E:\\EXCEL\\Ques01.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row1=sh1.getRow(r);
				row2=sh2.getRow(r);
				if(row2==null)
				{
					row2=sh2.createRow(r);
				}
				int cc=row1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell1=row1.getCell(c);
					cell2=row2.getCell(c);
					if(cell2==null)
					{
						cell2=row2.createCell(c);
					}
					String data =cell1.getStringCellValue();
					cell2.setCellValue(data);
				}

			}
			fout=new FileOutputStream("E:\\EXCEL\\Ques01.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
