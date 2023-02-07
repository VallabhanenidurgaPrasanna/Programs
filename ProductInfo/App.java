package com.java.ProductInfo;

/**
 * Hello world!

 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	Dao d=new DaoImpl();
    	Product p=new Product();      
         boolean ch=true;
         
        while(ch) {
        	
        	System.out.println("****** Menu ******");
        	System.out.println("1.insertmethod");
        	System.out.println("2.view all");
        	System.out.println("3.search by id");
        	System.out.println("4.Update");
        	System.out.println("5.delete");
        	System.out.println("0.exit");
        
        int choice=sc.nextInt();
        switch(choice) {
        	case 1:
        		System.out.println("enter id");
        		int eid=sc.nextInt();
        		p.setEid(eid);
        		System.out.println("enter name");
        		String name=sc.next();
        		p.setName(name);
        		System.out.println("enter salary");
        		int salary=sc.nextInt();
        		p.setSalary(salary);
        		d.insertMethod(p);        		
        	break;
        	case 2:
        		
        		d.viewAll();
        	break;
        	case 3:
        		System.out.println("enter id");
        	    eid=sc.nextInt();
        		d.searchById(eid);
        		break;
        	
        	case 4:
        		System.out.println("enter id");
        	    int eid1=sc.nextInt();
        	    System.out.println("enter name");
        	    String name1=sc.next();
        		d.update(eid1,name1);
        	break;
        	case 5:
        		System.out.println("enter id");
        	    int eid2=sc.nextInt();
        	     d.delete(eid2);
        	     break;
        	default:
        		ch=false;
        		break;
        }
        }
    }
}
