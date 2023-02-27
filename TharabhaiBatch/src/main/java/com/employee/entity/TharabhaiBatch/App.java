package com.employee.entity.TharabhaiBatch;
import java.util.*;
import com.Dao.DaoImpl;
import com.Dao.DaoInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println( "Hello World!" );
        Tharabhai obj=new Tharabhai();
        DaoInterface dao=new DaoImpl();
        int option=0;
        do {
        	System.out.println("1.insert data");
        	System.out.println("2.view all");
        	System.out.println("3.Update");
        	System.out.println("4.get by id");
        	System.out.println("5.Delete");
        	System.out.println("0.Exit");     	        
    
        option=sc.nextInt();
        switch(option) {
        case 1:
        	dao.insert();
        	break;
        case 2:
        	dao.getAllStudents();
        	break;
        case 3:		
        	
    		System.out.println("enter id");
    	    int id=sc.nextInt();
    	    System.out.println("enter name to update");
    		String name=sc.next();
        	dao.update(id,name);
        	break;
        case 4:
        	System.out.println("enter id");
    	    int id1=sc.nextInt();
        	dao.getById(id1);
        case 5:
        	System.out.println("enter id");
    	    int id2=sc.nextInt();
        	dao.deleteById(id2);		
        }
      
        }while(option!=0);
    }
}
