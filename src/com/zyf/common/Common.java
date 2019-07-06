package com.zyf.common;

public class Common {

	// connect the database
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_NAME = "tiyu";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "123456";
	public static final String IP = "127.0.0.1";
	public static final String PORT = "3306";
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/tiyu?useUnicode=true&characterEncoding=utf-8";
	
	// common
	public static final String EXCEL_PATH = "lib/tice.xls";
	
	// sql
	public static final String INSERT_STUDENT_SQL = "insert into student_tice(no, name, sex, grade, score, tall, weight) values(?, ?, ?, ?, ?, ?, ?)";
	public static final String UPDATE_STUDENT_SQL = "update student_tice set no = ?, name = ?, sex = ?, grade = ?, score = ?,tall = ?,weight = ? where id = ? ";
	public static final String SELECT_STUDENT_ALL_SQL = "select id,no,name,sex,grade,score,tall,weight from student_tice";
	public static final String SELECT_STUDENT_SQL = "select * from student_tice where no like ";
	public static final String SELECT_STUDENT_GRADE_SQL = "select * from student_tice where grade = ?";
	public static final String SELECT_STUDENT_TYPE_SQL = "select * from student_tice where ? = ?";
}
