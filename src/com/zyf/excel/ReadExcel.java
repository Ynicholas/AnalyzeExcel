package com.zyf.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.zyf.common.Common;
import com.zyf.excel.vo.Studentb;

public class ReadExcel {

	public List<Studentb> readXls() throws IOException {
		InputStream is = new FileInputStream(Common.EXCEL_PATH);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		Studentb studentb = null;
		List<Studentb> list = new ArrayList<Studentb>();
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			// 循环行Row
//			System.out.println(hssfSheet.getLastRowNum());
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if (hssfRow != null) {
					studentb = new Studentb();
					HSSFCell no = hssfRow.getCell(0);
					HSSFCell name = hssfRow.getCell(1);
					HSSFCell sex = hssfRow.getCell(2);
					HSSFCell grade = hssfRow.getCell(3);
					HSSFCell score = hssfRow.getCell(4);
					HSSFCell tall = hssfRow.getCell(5);
					HSSFCell weight = hssfRow.getCell(6);
					studentb.setNo(getValue(no));
//					System.out.println('a');
					studentb.setName(getValue(name));
//					System.out.println('b');
					studentb.setSex(getValue(sex));
//					System.out.println('c');
					studentb.setGrade(getValue(grade));
//					System.out.println('d');
					studentb.setScore(Float.valueOf(getValue(score)));
//					System.out.println('e');
					studentb.setTall(Float.valueOf(getValue(tall)));
//					System.out.println('f');
					studentb.setWeight(Float.valueOf(getValue(weight)));
//					System.out.println('g');
					list.add(studentb);
				}
			}
		}
		return list;
	}
	
	 @SuppressWarnings("static-access")
	private String getValue(HSSFCell hssfCell) {
		 Integer i = 0;
	        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
	            // 返回布尔类型的值
//	        	System.out.print(hssfCell.getBooleanCellValue()+" ");
	            return String.valueOf(hssfCell.getBooleanCellValue());
	        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
	            // 返回数值类型的值
//	        	System.out.print(hssfCell.getNumericCellValue()+" ");
	            return String.valueOf(hssfCell.getNumericCellValue());
	        } else{
	            // 返回字符串类型的值
//	        	System.out.print(hssfCell.getStringCellValue()+" ");
	            return String.valueOf(hssfCell.getStringCellValue());
	        } 
	    }
}
