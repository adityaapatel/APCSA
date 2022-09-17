
//Aditya Patel
//Mr.I
//Weight on other planets program
// 9/20/21eu


import java.util.*;


public class WeightOnOtherPlanets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner EarthWeight = new Scanner( System.in);
		System.out.print("What is your weight on the Earth?");
		
		double eWeight = (EarthWeight.nextDouble());
		
		System.out.println("1. Voltar");
		System.out.println("2.Krypton");
		System.out.println("3. Fertos:");
		System.out.println("4. Servontos");
	
		
		Scanner Selection = new Scanner (System.in);
		System.out.print("Selection?: ");
		int Select = (Selection.nextInt());
		
		
			
		
		switch(Select)
		{ 
		case 1 :  System.out.println("Your Weight on Volar is "+ (eWeight * 0.091));
		break;
		case 2: System.out.println("Your Weight on Krypton is "+ (eWeight * 0.720));
		break;
		case 3: System.out.println("Your Weight on Fertos is "+ (eWeight * 0.865));
		break;
		case 4:System.out.println("Your Weight on Servontos is "+ (eWeight * 4.612));
		break;
		default: System.out.println(" Your Selction must be 1-4" );
		break;
		
		}
		
		System.out.println( "Thanks for using the converter");
		
		
		
	}

}
