package com.sgtesting.excelassignassengmment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques5 {

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
			sh= wb.createSheet("States");
			//Create row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("State Names");
			for(int i=1;i<=20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				cell.setCellValue("State "+i);
			}
			/*row=sh.createRow(1);
			cell=row.createCell(1);
			cell.setCellValue("State 1");
			row=sh.createRow(2);
			cell=row.createCell(2);
			cell.setCellValue("State 2");
			row=sh.createRow(3);
			cell=row.createCell(3);
			cell.setCellValue("State 3");
			row=sh.createRow(4);
			cell=row.createCell(4);
			cell.setCellValue("State 4");
			row=sh.createRow(5);
			cell=row.createCell(5);
			cell.setCellValue("State 5");
			row=sh.createRow(6);
			cell=row.createCell(6);
			cell.setCellValue("State 6");
			row=sh.createRow(7);
			cell=row.createCell(7);
			cell.setCellValue("State 7");
			row=sh.createRow(8);
			cell=row.createCell(8);
			cell.setCellValue("State 8");
			row=sh.createRow(9);
			cell=row.createCell(9);
			cell.setCellValue("State 9");
			row=sh.createRow(10);
			cell=row.createCell(10);
			cell.setCellValue("State 10");
			row=sh.createRow(11);
			cell=row.createCell(11);
			cell.setCellValue("State 11");
			row=sh.createRow(12);
			cell=row.createCell(12);
			cell.setCellValue("State 12");
			row=sh.createRow(13);
			cell=row.createCell(13);
			cell.setCellValue("State 13");
			row=sh.createRow(14);
			cell=row.createCell(14);
			cell.setCellValue("State 14");
			row=sh.createRow(15);
			cell=row.createCell(15);
			cell.setCellValue("State 15");
			row=sh.createRow(16);
			cell=row.createCell(16);
			cell.setCellValue("State 16");
			row=sh.createRow(17);
			cell=row.createCell(17);
			cell.setCellValue("State 17");
			row=sh.createRow(18);
			cell=row.createCell(18);
			cell.setCellValue("State 18");
			row=sh.createRow(19);
			cell=row.createCell(19);
			cell.setCellValue("State 19");
			row=sh.createRow(20);
			cell=row.createCell(20);
			cell.setCellValue("State 20");*/
			
			fout =new FileOutputStream("E:\\EXCEL\\Ques15.xlsx");
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
