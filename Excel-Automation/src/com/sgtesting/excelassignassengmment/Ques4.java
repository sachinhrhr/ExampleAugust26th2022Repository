package com.sgtesting.excelassignassengmment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques4 {

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
			sh= wb.createSheet("Flowers and Colors");
			//Create row for flower and colors
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Flower Names");
			cell=row.createCell(1);
			cell.setCellValue("Color Names");
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Flower 1");
			cell=row.createCell(1);
			cell.setCellValue("Color 1");
			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Flower 2");
			cell=row.createCell(1);
			cell.setCellValue("Color 2");
			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Flower 3");
			cell=row.createCell(1);
			cell.setCellValue("Color 3");
			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("Flower 4");
			cell=row.createCell(1);
			cell.setCellValue("Color 4");
			row=sh.createRow(5);
			cell=row.createCell(0);
			cell.setCellValue("Flower 5");
			cell=row.createCell(1);
			cell.setCellValue("Color 5");
			row=sh.createRow(6);
			cell=row.createCell(0);
			cell.setCellValue("Flower 6");
			cell=row.createCell(1);
			cell.setCellValue("Color 6");
			row=sh.createRow(7);
			cell=row.createCell(0);
			cell.setCellValue("Flower 7");
			cell=row.createCell(1);
			cell.setCellValue("Color 7");
			row=sh.createRow(8);
			cell=row.createCell(0);
			cell.setCellValue("Flower 8");
			cell=row.createCell(1);
			cell.setCellValue("Color 8");
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Flower 9");
			cell=row.createCell(1);
			cell.setCellValue("Color 9");
			row=sh.createRow(10);
			cell=row.createCell(0);
			cell.setCellValue("Flower 10");
			cell=row.createCell(1);
			cell.setCellValue("Color 10");
			row=sh.createRow(11);
			cell=row.createCell(0);
			cell.setCellValue("Flower 11");
			cell=row.createCell(1);
			cell.setCellValue("Color 11");
			row=sh.createRow(12);
			cell=row.createCell(0);
			cell.setCellValue("Flower 12");
			cell=row.createCell(1);
			cell.setCellValue("Color 12");
			row=sh.createRow(13);
			cell=row.createCell(0);
			cell.setCellValue("Flower 13");
			cell=row.createCell(1);
			cell.setCellValue("Color 13");
			row=sh.createRow(14);
			cell=row.createCell(0);
			cell.setCellValue("Flower 14");
			cell=row.createCell(1);
			cell.setCellValue("Color 14");
			row=sh.createRow(15);
			cell=row.createCell(0);
			cell.setCellValue("Flower 15");
			cell=row.createCell(1);
			cell.setCellValue("Color 15");
			row=sh.createRow(16);
			cell=row.createCell(0);
			cell.setCellValue("Flower 16");
			cell=row.createCell(1);
			cell.setCellValue("Color 16");
			row=sh.createRow(17);
			cell=row.createCell(0);
			cell.setCellValue("Flower 17");
			cell=row.createCell(1);
			cell.setCellValue("Color 17");
			row=sh.createRow(18);
			cell=row.createCell(0);
			cell.setCellValue("Flower 18");
			cell=row.createCell(1);
			cell.setCellValue("Color 18");
			row=sh.createRow(19);
			cell=row.createCell(0);
			cell.setCellValue("Flower 19");
			cell=row.createCell(1);
			cell.setCellValue("Color 19");
			row=sh.createRow(20);
			cell=row.createCell(0);
			cell.setCellValue("Flower 20");
			cell=row.createCell(1);
			cell.setCellValue("Color 20");
			
			
			fout =new FileOutputStream("E:\\EXCEL\\Ques4.xlsx");
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
