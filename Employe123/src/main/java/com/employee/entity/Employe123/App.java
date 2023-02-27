package com.employee.entity.Employe123;

import com.Dao.Dao;
import com.Dao.DaoImpl;
import java.util.*;
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
        Dao dao=new DaoImpl();
        int option=0;
        do {
        	System.out.println("1.insert");
        	System.out.println("2.View All");
        	System.out.println("3.update");
        	System.out.println("4.search by id");
        	System.out.println("5.delete");
        	System.out.println("6.List Of Records desc");
        	System.out.println("7.List Of Records Asce");
        	System.out.println("8.Range ");
        	System.out.println("9.display Salary");
        	System.out.println("10.Group by City");
        	System.out.println("0.Exit");
            option=sc.nextInt();
            switch(option) {
            case 1:
            	dao.insert();
            	break;
            case 2:
            	dao.viewAll();
            	break;
            case 3:
            	System.out.println("enter eid");
            	int eid=sc.nextInt();
            	System.out.println("enter name to update");
            	String name=sc.next();
            	dao.update(eid, name);
            	break;
            case 4:
            	System.out.println("enter eid");
            	 eid=sc.nextInt();
            	dao.searchById(eid);
            	break;
            case 5:
             System.out.println("enter eid");
           	 eid=sc.nextInt();
           	 dao.deleteById(eid);
           	 break;
            case 6:
            	dao.listOfRecordsDesc();
            	break;
            case 7:
            	dao.listOfRecordsAsce();
            	break;
            case 8:
            	dao.rangeOf();
            	break;
            case 9:
            	dao.displaySalary();
            	break;
            case 10:
            	dao.groupByCity();
            	break;
            }
        }while(option!=0);
    }
}
