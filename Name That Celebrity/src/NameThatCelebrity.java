
public class NameThatCelebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Allan Alda";
		String s2 = "John Wayne";
		String s3 = "Gregory Peck";
		
		String l1 = s1.substring(2,5); String L11 = s1.substring(6,7);
		String l2 = s2.substring(2,5); String L22 = s2.substring(5,7);
		String l3 = s3.substring(2,7); String L33 = s3.substring(8,9);
		
		System.out.println( s1 + " >>> " + s1.substring(2,(s1.length()-3)) ); 
		System.out.println( s2 + " >>> " + s2.substring(2,(s2.length()-3)) ); 
		System.out.println( s3 + " >>> " + s3.substring(2,(s3.length()-3)) );
	
		//System.out.println(s1+ ">>>" +l1 +" " + L11); 
		//.out.println(s2+ ">>>" +l2 +" " + L22);
		//System.out.println(s3+ ">>>" +l3 +" " + L33); 
		

		

	}

}
