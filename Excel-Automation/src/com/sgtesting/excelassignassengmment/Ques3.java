package com.sgtesting.excelassignassengmment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//in row 
public class Ques3 {

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
			sh= wb.createSheet("City");
			//Create row
			row=sh.createRow(0);
			cell=row.createCell(4);
			cell.setCellValue("City Names");
			for(int i=1;i<=20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(4);
				cell.setCellValue("City"+i);
			}
			/*row=sh.createRow(1);
			cell=row.createCell(4);
			cell.setCellValue("City 1");
			row=sh.createRow(2);
			cell=row.createCell(4);
			cell.setCellValue("City 2");
			row=sh.createRow(3);
			cell=row.createCell(4);
			cell.setCellValue("City 3");
			row=sh.createRow(4);
			cell=row.createCell(4);
			cell.setCellValue("City 4");
			row=sh.createRow(5);
			cell=row.createCell(4);
			cell.setCellValue("City 5");
			row=sh.createRow(6);
			cell=row.createCell(4);
			cell.setCellValue("City 6");
			row=sh.createRow(7);
			cell=row.createCell(4);
			cell.setCellValue("City 7");
			row=sh.createRow(8);
			cell=row.createCell(4);
			cell.setCellValue("City 8");
			row=sh.createRow(9);
			cell=row.createCell(4);
			cell.setCellValue("City 9");
			row=sh.createRow(10);
			cell=row.createCell(4);
			cell.setCellValue("City 10");
			row=sh.createRow(11);
			cell=row.createCell(4);
			cell.setCellValue("City 11");
			row=sh.createRow(12);
			cell=row.createCell(4);
			cell.setCellValue("City 12");
			row=sh.createRow(13);
			cell=row.createCell(4);
			cell.setCellValue("City 13");
			row=sh.createRow(14);
			cell=row.createCell(4);
			cell.setCellValue("City 14");
			row=sh.createRow(15);
			cell=row.createCell(4);
			cell.setCellValue("City 15");
			row=sh.createRow(16);
			cell=row.createCell(4);
			cell.setCellValue("City 16");
			row=sh.createRow(17);
			cell=row.createCell(4);
			cell.setCellValue("City 17");
			row=sh.createRow(18);
			cell=row.createCell(4);
			cell.setCellValue("City 18");
			row=sh.createRow(19);
			cell=row.createCell(4);
			cell.setCellValue("City 19");
			row=sh.createRow(20);
			cell=row.createCell(4);
			cell.setCellValue("City 20");*/
			
			fout =new FileOutputStream("E:\\EXCEL\\Ques13.xlsx");
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
