package com.zyf.client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.zyf.excel.ReadExcel;
import com.zyf.excel.SaveData2DB;
import com.zyf.excel.util.DbUtil;
import com.zyf.excel.vo.Studentb;

public class Client {

	public static void main(String[] args) throws IOException, SQLException {
		SaveData2DB saveData2DB = new SaveData2DB();
		saveData2DB.save();
//		DbUtil.getFlowers();
		System.out.println("end");
//		ReadExcel xlsMain = new ReadExcel();
//		Studentb studentb = null;
//		List<Studentb> list = xlsMain.readXls();
//		System.out.println("end");
	}
}
