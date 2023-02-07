package com.java.ProductInfo;

import java.sql.*;

public class DaoImpl implements Dao {

	
	Connection con=null;
	DaoImpl()   {	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				 
				if(con!=null) {
					System.out.println("connected");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	}
	public void insertMethod(Product p) {
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1,p.getEid());
			pstmt.setString(2, p.getName());
			pstmt.setInt(3, p.getSalary());
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("inserted successfull");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void viewAll() {
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchById(int eid) {
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product where eid='"+eid+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void update(int eid,String name) {
		try {
			Statement st=con.createStatement();
			int i=st.executeUpdate("update product set name='"+name+"' where eid='"+eid+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void delete(int eid) {
		try {
			Statement st=con.createStatement();
			int i=st.executeUpdate("delete from product where eid='"+eid+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	}
	
	

