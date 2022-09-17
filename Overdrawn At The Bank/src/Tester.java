import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner balScan = new Scanner(System.in);
System.out.print("What is your Balance Currently: ");
		
 double bal = balScan.nextDouble();

Scanner nameScan = new Scanner(System.in);
System.out.print("What is your Name? ");
String name = nameScan.nextLine();


BankAccount myAccount = new BankAccount(bal,name);

{
//Scanner DWscan = new Scanner (System.in);
//System.out.print( "Please enter, 1 for a Deposit | or 2 for a Withdrawal");

//int choice = DWscan.nextInt();



//if ( choice == 1 && choice <= 2 && choice >= 1)
	
{
	Scanner d = new Scanner(System.in);
   System.out.print("What is the amount you would like to deposit? ");	
	double dep =  d.nextDouble();
	
	myAccount.deposit(dep);
	System.out.println("Success, " + name + " Your New Balance is: " + "$"+ myAccount.getBal());
	
}
//if ( choice == 2 && choice <= 2 && choice >= 1)
	
{
	Scanner w = new Scanner(System.in);
   System.out.print("What is the amount you would like to withdraw? ");	
	double wd =  w.nextDouble();
	
	myAccount.withdrawal(wd);
	System.out.println("Success, The " + name + " Bank Account New Balance is: " + "$"+ myAccount.getBal());
	



}
	
	
	
}

		
				
		
	}
}


