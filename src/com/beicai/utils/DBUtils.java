package com.beicai.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beicai.bean.Book;

public class DBUtils {
	private static final String MYDRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/beicai?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai";
	private static final String USER = "root";
	private static final String PASSWORD = "123456";
	private Connection con;

	public DBUtils() {
		try {
			Class.forName(MYDRIVER);
			this.con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return this.con;
	}

	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// public static void main(String[] args) {
	// try {
	//
	// Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
	// String sql = "select * from book where id=?;";
	// PreparedStatement pst = con.prepareStatement(sql);
	// pst.setInt(1, 1);
	// ResultSet rst = pst.executeQuery();
	// Book book = null;
	// while (rst.next()) {
	// int id = rst.getInt("id");
	// String name = rst.getString("name");
	// String writer = rst.getString("writer");
	// double price = rst.getDouble("price");
	// book = new Book(id, name, writer, price);
	// }
	// System.out.println(book.toString());
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

}
