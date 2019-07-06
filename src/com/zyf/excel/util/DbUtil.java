package com.zyf.excel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zyf.common.Common;
import com.zyf.excel.vo.Studentb;

public class DbUtil {

	/**
	 * @param sql
	 */

	public static void insert(String sql, Studentb studentb) throws SQLException {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL, Common.USERNAME, Common.PASSWORD);
			ps = conn.prepareStatement(sql);
			ps.setString(1, studentb.getNo());
			ps.setString(2, studentb.getName());
			ps.setString(3, studentb.getSex());
			ps.setString(4, studentb.getGrade());
			ps.setString(5, String.valueOf(studentb.getScore()));
			ps.setString(6, String.valueOf(studentb.getTall()));
			ps.setString(7, String.valueOf(studentb.getWeight()));
			boolean flag = ps.execute();
			if(!flag){
				System.out.println("Save data : No. = " + studentb.getNo() + " , Name = " + studentb.getName() + ", sex = " + studentb.getSex() + " succeed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List selectOne(String sql, Studentb studentb) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL, Common.USERNAME, Common.PASSWORD);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				if(rs.getString("no").equals(studentb.getNo()) || rs.getString("name").equals(studentb.getName())|| rs.getString("sex").equals(studentb.getSex())){
					list.add(1);
				}else{
					list.add(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;
	}
	
	
	public static ResultSet selectAll(String sql) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL, Common.USERNAME, Common.PASSWORD);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return rs;
	}
	
	public static Object[][] getFlowers() throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int k = 7;
		try{
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL,Common.USERNAME,Common.PASSWORD);
			ps = conn.prepareStatement(Common.SELECT_STUDENT_ALL_SQL);
			rs = ps.executeQuery();
			int sample = 0;
			while(rs.next()){
				sample++;
			}
			Object[][] flower = new Object[sample][k];
			rs = ps.executeQuery();
			for(int i = 0;rs.next();i++){
				for (int j = 0;j < k;j++){
					flower[i][j] = rs.getString(j+2);
				}
			}
//			System.out.println("花花：");
//			for(int i = 0;i<flower.length;i++){
//				for(int j = 0;j < flower[0].length;j++){
//					System.out.print(flower[i][j]+"\t");
//				}
//				System.out.println();
//			}
			return flower;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(rs != null){
				rs.close();
			}
			if (ps != null){
				ps.close();
			}
			if (conn != null){
				conn.close();
			}
		}
	}
	
	public static Object[][] getGradeFlowers(String grade) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int k = 7;
		try{
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL,Common.USERNAME,Common.PASSWORD);
			ps = conn.prepareStatement(Common.SELECT_STUDENT_GRADE_SQL);
			ps.setString(1, grade);
			rs = ps.executeQuery();
			int sample = 0;
			while(rs.next()){
				sample++;
			}
			Object[][] flower = new Object[sample][k];
			rs = ps.executeQuery();
			for(int i = 0;rs.next();i++){
				for (int j = 0;j < k;j++){
					flower[i][j] = rs.getString(j+2);
				}
			}
//			System.out.println("花花：");
//			for(int i = 0;i<flower.length;i++){
//				for(int j = 0;j < flower[0].length;j++){
//					System.out.print(flower[i][j]+"\t");
//				}
//				System.out.println();
//			}
			return flower;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(rs != null){
				rs.close();
			}
			if (ps != null){
				ps.close();
			}
			if (conn != null){
				conn.close();
			}
		}
	}
	
	public static Object[][] getTypeFlowers(String str1,String str2) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int k = 7;
		try{
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL,Common.USERNAME,Common.PASSWORD);
			String sql = "select * from student_tice where "+str1+" = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, str2);
			rs = ps.executeQuery();
			int sample = 0;
			while(rs.next()){
				sample++;
			}
			Object[][] flower = new Object[sample][k];
			rs = ps.executeQuery();
			for(int i = 0;rs.next();i++){
				for (int j = 0;j < k;j++){
					flower[i][j] = rs.getString(j+2);
				}
			}
//			System.out.println("花花：");
//			for(int i = 0;i<flower.length;i++){
//				for(int j = 0;j < flower[0].length;j++){
//					System.out.print(flower[i][j]+"\t");
//				}
//				System.out.println();
//			}
			return flower;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(rs != null){
				rs.close();
			}
			if (ps != null){
				ps.close();
			}
			if (conn != null){
				conn.close();
			}
		}
	}
	
	public static Object[][] getType2Flowers(String str1,String str2,String str3) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int k = 7;
		try{
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL,Common.USERNAME,Common.PASSWORD);
			String sql = "select * from student_tice where "+str1+" = ? "+"order by "+"?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, str2);
			ps.setString(2, str3);
			rs = ps.executeQuery();
			int sample = 0;
			while(rs.next()){
				sample++;
			}
			Object[][] flower = new Object[sample][k];
			rs = ps.executeQuery();
			for(int i = 0;rs.next();i++){
				for (int j = 0;j < k;j++){
					flower[i][j] = rs.getString(j+2);
				}
			}
//			System.out.println("花花：");
//			for(int i = 0;i<flower.length;i++){
//				for(int j = 0;j < flower[0].length;j++){
//					System.out.print(flower[i][j]+"\t");
//				}
//				System.out.println();
//			}
			return flower;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(rs != null){
				rs.close();
			}
			if (ps != null){
				ps.close();
			}
			if (conn != null){
				conn.close();
			}
		}
	}

}