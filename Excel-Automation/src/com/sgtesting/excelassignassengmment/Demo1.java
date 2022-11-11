package com.sgtesting.excelassignassengmment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) {
		Duplicate();
	}
	private static void Duplicate()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet st=null;
		Sheet st1=null;
		Row row=null;
		Row row1=null;
		Cell cell=null;
		Cell cell1=null;
		FileOutputStream fout=null;
		try
		{
			fin=new FileInputStream("E:\\EXCEL\\Ques01.xlsx");
			wb=new XSSFWorkbook(fin);
			st=wb.getSheet("Sheet1");
			st1=wb.getSheet("Sheet2");
			if(st1==null)
			{
				st1=wb.createSheet("Sheet2");
			}	
			int rc=st.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=st.getRow(r);
				row1=st1.getRow(r);
				if(row1==null)
				{
					row1=st1.createRow(r);
				}
				int cc=row1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					cell1=row1.getCell(c);
					if(cell1==null)
					{
						cell1=row1.createCell(c);
					}
					String data =cell.getStringCellValue();
					cell1.setCellValue(data);
				}
				fout=new FileOutputStream("E:\\EXCEL\\Ques01.xlsx");
				wb.write(fout);
			}
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
