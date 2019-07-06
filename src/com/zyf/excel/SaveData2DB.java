package com.zyf.excel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.zyf.common.Common;
import com.zyf.excel.ReadExcel;
import com.zyf.excel.util.DbUtil;
import com.zyf.excel.vo.Studentb;

public class SaveData2DB {

	@SuppressWarnings({ "rawtypes" })
	public void save() throws IOException, SQLException {
		ReadExcel xlsMain = new ReadExcel();
		Studentb studentb = null;
		List<Studentb> list = xlsMain.readXls();

		for (int i = 0; i < list.size(); i++) {
			studentb = list.get(i);
			List l = DbUtil.selectOne(Common.SELECT_STUDENT_SQL + "'%" + studentb.getNo() + "%'", studentb);
			if (!l.contains(1)) {
				DbUtil.insert(Common.INSERT_STUDENT_SQL, studentb);
			} else {
				System.out.println("The Record was Exist : No. = " + studentb.getNo() + " , Name = " + studentb.getName() + ", sex = " + studentb.getSex() + ", and has been throw away!");
			}
		}
	}
}
