package com.tekworkss.Arogya;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class App 
{
	private static Scanner sc;
	public static void main( String[] args ) 
    {
      sc=new Scanner(System.in);
        Dao d=new DaoImpl();
        Patient p[]=new Patient[3];  
        boolean ch=true;
        try {
        	FileReader fr=new FileReader("Book1.csv");
        	BufferedReader br=new BufferedReader(fr);
        while(ch) {
        	System.out.println("********* MENU ***********");
        	System.out.println("1.patientRegistration");
        	System.out.println("2.View All Patients");
        	System.out.println("3.searchPatientById");
        	System.out.println("4.deletePatientById");
        	System.out.println("5.searchPatientBycity");
        	System.out.println("6.searchPatientByAgeGroup");
        	System.out.println("7.searchByPatientRecovery");
        	int choice=sc.nextInt();
        	switch(choice) {
        	case 1:
        		String str;
        		while((str=br.readLine())!=null){
        			int i=0;
        			p[i]=new Patient();
        			String arr[]=str.split(",");
        			if(arr[0].length()<=2) {
        				p[i].setAge(Integer.parseInt(arr[0]));
        			}
        			else {
        				System.out.println("Invalid age");
        				break;
        			}
        			p[i].setName(arr[1]);
        			p[i].setGender(arr[2]);
        			p[i].setCity(arr[3]);
        			p[i].setAddress(arr[4]);
        			p[i].setG_name(arr[5]);
        			p[i].setG_address(arr[6]);
        			p[i].setDate_of_admission(arr[7]);
        			if(arr[8].length()==12) {
        				p[i].setAadharno((arr[8]));
        			}
        			else {
        				System.out.println("Invalid aadhar no");
        				break;
        			}
        			if(arr[9].length()==10) {
        				p[i].setContact_no(Long.parseLong(arr[9]));
        			}
        			else {
        				System.out.println("Invalid contacy number");
        				break;
        			}
        			if(arr[10].length()==10) {
      				p[i].setG_contact_no(Long.parseLong(arr[10]));
        				
        			}
        			else {
        				System.out.println("invalid gurdian contact number");
        				break;
        			}
        			p[i].setRecovery(arr[11]);
        			d.patientRegistration(p[i]);
        			i++;
        		}
        		
        		break;      		
//        		System.out.println("enter Patient name");
//        		String name=sc.next();
//        		p.setName(name);
//        		System.out.println("enter Patient age");
//        		int age=sc.nextInt();
//        		p.setAge(age);
//        		System.out.println("enter Patient gender");
//        		String gender =sc.next();
//        		p.setGender(gender);
//        		System.out.println("enter Patient Aadharno");
//        		long aadharno=sc.nextLong();
//        		p.setAadharno(aadharno);
//        		System.out.println("enter Patient mobile number");
//        		long contact_no=sc.nextLong();
//        		p.setContact_no(contact_no);
//        		System.out.println("enter Patient city");
//        		String city=sc.next();
//        		p.setCity(city);
//        		System.out.println("enter Patient Address");
//        		String address=sc.next();
//        		p.setAddress(address);
//        		System.out.println("enter Patient Date_of_Admission (YY-MM-DD)");
//        		String date_of_admission=sc.next();
//        		p.setDate_of_admission(date_of_admission);
//        		System.out.println("enter Guardian name");
//        		String g_name=sc.next();
//        		p.setG_name(g_name);
//        		System.out.println("enter Guardian address");
//        		String g_address=sc.next();
//        		p.setG_address(g_address);
//        		System.out.println("enter Guardian contact");
//        		long g_contact_no=sc.nextLong();
//        		p.setG_contact_no(g_contact_no);
        		
        		
        	case 2:
        		d.viewAllPatients();
        		break;
        	case 3:
        		System.out.println("enter Patient id to search");
        		int id1=sc.nextInt();
        		d.searchPatientById(id1);
        		break;
        	case 4:
        		System.out.println("enter patient id to delete");
        		int id2=sc.nextInt();
        		d.deletePatientById(id2);
        		break;
        	case 5:
        		System.out.println("enter city to search");
        		String ccity=sc.next();
        		d.searchPatientBycity(ccity);
        		break;
        	case 6:
        		System.out.println("enter age to get patient details");
        		int start=sc.nextInt();
        		int end=sc.nextInt();
        		d.searchPatientByAgeGroup(start,end);
                break;
        	case 7:
        		System.out.println("enter patient id to mark as recover");
        		int id3=sc.nextInt();
        		d.searchByPatientRecovery(id3);
        		break;
        		default:
        			ch=false;
        			break;
        	}
        }
        }
        catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
