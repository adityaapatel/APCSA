 // Aditya Patel
// Change in A Dollar Program
// 9/25/21
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    // 0-100 penny 
		// 0-20 nickel
		//0 -10 dime
		//0-4 quarter
		// 0-2 half dollar
		// 0-1 dollar coin
		
	int count = 1;
	
	{
		for(int dollarc = 0; dollarc<=1; dollarc++)
		{

	          for( int halfdollar =0; halfdollar<=2 ; halfdollar++)
	          {

	              for( int quarters =0;quarters<=4;quarters++)
	              {

	                  for( int dimes =0;dimes<=10;dimes++)
	                  {

	                      for( int nickels =0;nickels<=20;nickels++)
	                      {

	                          for( int pennies =0;pennies<=100;pennies++)
	                          {

	                              if(  dollarc * 100 + halfdollar * 50 + quarters* 25 + dimes *10 + nickels * 5 + pennies == 100)
	                              {
	                            	  
                                      
                                      
	                                  System.out.println( " " + count++ + "." + " " + dollarc +" DollarC, " + halfdollar +" Half Dollars, " + quarters + " Quarters, " +dimes +" Dimes, "+ nickels + " Nickels, "+ pennies +" Pennies, " + " \n");
                                        
	                              }

	                          }

	                      }

	                  }

	              }

	          }

	      }
	}
	     
		System.out.println("The total number of combination's is:" + "" +( count - 1));
	    }

	}
			
