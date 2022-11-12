package com.sgtesting.excelassignassengmment;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques2 {

	public static void main(String[] args) {
		writeContent();
		
	}
	private static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb= new XSSFWorkbook();
			sh= wb.createSheet("Colors");
			//Create row
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Colors Names");
			for(int i=1;i<=20;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue("Color "+i);	
			}
			/*cell=row.createCell(1);
			cell.setCellValue("Color 1");
			cell=row.createCell(2);
			cell.setCellValue("Color 2");
			cell=row.createCell(3);
			cell.setCellValue("Color 3");
			cell=row.createCell(4);
			cell.setCellValue("Color 4");
			cell=row.createCell(5);
			cell.setCellValue("Color 5");
			cell=row.createCell(6);
			cell.setCellValue("Color 6");
			cell=row.createCell(7);
			cell.setCellValue("Color 7");
			cell=row.createCell(8);
			cell.setCellValue("Color 8");
			cell=row.createCell(9);
			cell.setCellValue("Color 9");
			cell=row.createCell(10);
			cell.setCellValue("Color 10");
			cell=row.createCell(11);
			cell.setCellValue("Color 11");
			cell=row.createCell(12);
			cell.setCellValue("Color 12");
			cell=row.createCell(13);
			cell.setCellValue("Color 13");
			cell=row.createCell(14);
			cell.setCellValue("Color 14");
			cell=row.createCell(15);
			cell.setCellValue("Color 15");
			cell=row.createCell(16);
			cell.setCellValue("Color 16");
			cell=row.createCell(17);
			cell.setCellValue("Color 17");
			cell=row.createCell(18);
			cell.setCellValue("Color 18");
			cell=row.createCell(19);
			cell.setCellValue("Color 19");
			cell=row.createCell(20);
			cell.setCellValue("Color 20");*/
			
			fout =new FileOutputStream("E:\\EXCEL\\Ques12.xlsx");
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
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
