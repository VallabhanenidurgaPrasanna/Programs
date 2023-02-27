import java.sql.SQLException;
import java.util.*;
import com.DAO.DaoImpl;

public class App {

	public static void main(String args[]) throws SQLException {
		Scanner sc=new Scanner(System.in);
		int option=0;
		DaoImpl obj=new DaoImpl();
		do {
		System.out.println("Enter 1 for insert");
		System.out.println("Enter 2 for update");
		System.out.println("Enter 3 for delete");
		System.out.println("Enter 4 for viewall student");
		System.out.println("Enter 0 for Exit");
		System.out.println();
	     option=sc.nextInt();
		
	     if(option==1) {
	    	 obj.insert();
	     }
	     else if(option==2) {
	    	 obj.update();
	     }
	     else if(option==3) {
	    	 obj.delete();
	     }
	     else if(option==4) {
	    	 obj.viewAllStudents();
	     }
		}while(option != 0);
		
	}
}



































//import java.sql.*;
//
//public class App {
//
//	public static void main(String[] args) throws SQLException {
//		Connection con=null;
//		// Register driver
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			
//			//get connection
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		if(con!=null) {
//			System.out.println("connected successfully");
//		}
//		/*
//		//3.create the statement
//        PreparedStatement pstmt=con.prepareStatement("insert into Tharabai values(?,?,?)");
//        
//        pstmt.setInt(1, 101);
//        pstmt.setString(2, "Prasanna");
//        pstmt.setString(3, "prasanna@gmail.com");
//        
//        //4.execute query
//        int i=pstmt.executeUpdate();
//        
//        if(i>=1) {
//            System.out.println("data inserted  successfully");
//        }
//        //close conection
//        //con.close();
//         */
//         
//	/*	
//       Statement st=con.createStatement();
//       String name="Sai";
//       int i=st.executeUpdate("update Tharabai set name='"+name+"' where id='"+101+"'");
//       if(i>=1) {
//    	   System.out.println("data updated successfully");
//       }
//		*/
//		
////		Statement st1=con.createStatement();
////	       int i=st1.executeUpdate("delete from Tharabai where id='"+101+"'");
////	       if(i>=1) {
////	    	   System.out.println("data deleted successfully");
////	       }
//		
//		Statement st2=con.createStatement();
//		ResultSet rs=st2.executeQuery("select * from Tharabai");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "+rs.getString(3));
//		}
//		
//	} 
//	
//
//}
