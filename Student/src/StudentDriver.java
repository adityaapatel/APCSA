//Aditya Patel
// Mr.I
//Student Project



import java.io.*;
import java.util.*;
public class StudentDriver {
//TESTER 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner StudentScan = new Scanner(System.in);
	
    System.out.print("Enter Name: ");
	String name = StudentScan.nextLine();
	
	System.out.print("Enter ID: ");
	int id = StudentScan.nextInt();
	
	System.out.print ( "Enter your GPA: ");
	double gpa = StudentScan.nextDouble();
	
	student s1 = new student(name, id );
	
	s1.setGPA(gpa);
	s1.getGPA();
	s1.getID();
	s1.getname();
	
	
	System.out.println(s1);  // works
	System.out.println();
	
	
	 Scanner StudentScan2 = new Scanner(System.in);
		
	    System.out.print("Enter Name: ");
		String name2 = StudentScan2.nextLine();
		
		System.out.print("Enter ID: ");
		int id2 = StudentScan2.nextInt();
		
		System.out.print ( "Enter your GPA: ");
		double gpa2 = StudentScan2.nextDouble();
		student s2 = new student(name, id );
		
	s2.setGPA(gpa);
	s2.getGPA();
	s2.getID();
	s2.getname();
	
	System.out.println(s2); // Works
	
			
}
	}
