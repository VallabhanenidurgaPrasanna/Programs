package com.tekworkss.Arogya;

import java.sql.*;

public class DaoImpl implements Dao {
	Connection con=null;
	
	  DaoImpl(){
			
			//1.register driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			//2.Get connection
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aarogyaa","root","root");
			
			 if(con!=null) {
					System.out.println("connected successfully");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
	}

	public void patientRegistration(Patient p){	

			try {
				
				PreparedStatement pstmt = con.prepareStatement("insert into Patient values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pstmt.setString(1, null);
				pstmt.setInt(2, p.getAge());
				pstmt.setString(3, p.getName());
				pstmt.setString(4, p.getGender());
				pstmt.setString(5, p.getCity());
				pstmt.setString(6, p.getAddress());
				pstmt.setString(7, p.getG_name());
				pstmt.setString(8, p.getG_address());
				pstmt.setString(9, p.getDate_of_admission());
				pstmt.setString(10,p.getAadharno());
				pstmt.setLong(11,p.getContact_no());
				pstmt.setLong(12,p.getG_contact_no());
				pstmt.setString(13,p.getRecovery());
				int i=pstmt.executeUpdate();	    
				{
					if(i!=0) {
						System.out.println("inserted successfully");
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	public void viewAllPatients() {
		
		try {
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from Patient");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getLong(10)+" "+rs.getLong(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void searchPatientById(int id) {
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from Patient where id='"+id+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getLong(10)+" "+rs.getLong(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void deletePatientById(int id) {
		Statement st;
		try {
			st = con.createStatement();
			int i=st.executeUpdate("delete from Patient where id='"+id+"'");
			if(i>0) {
				System.out.println("deleted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void searchPatientBycity(String city) {
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from Patient where city='"+city+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getLong(10)+" "+rs.getLong(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchPatientByAgeGroup(int start,int end) {
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient where age between '"+start+"' and '"+end+"'");
	        while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getLong(10)+" "+rs.getLong(11)+" "+rs.getLong(12)+" "+rs.getString(13));	
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchByPatientRecovery(int id) {
		Statement st;
		try {
			st = con.createStatement();
		   int i=st.executeUpdate("update Patient set recovery='"+"recoverd"+"' where id='"+id+"'");
			if(i>0) {
				System.out.println("patient has been recovered successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
