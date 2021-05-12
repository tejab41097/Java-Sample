package default_package;

public class Day2Code {


	//static variable
	static int j =0;

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//Types of variables
		final int i = 0;
		System.out.println("Final Int: "+ i);
		int j = 0;//int data Type
		j = 1;
		System.out.println("Normal Int:"+ j);
		char someThing = 'c'; //char data Type
		System.out.println("Normal Char:"+ someThing);
		
		float tempFloat = (float) 0.23451234567890123456789034567812345678934567893456789; //float data Type
		System.out.println(tempFloat);
		double tempDouble = (double) 0.234534567890345675678; //double data Type
		tempFloat = (float) tempDouble;
		System.out.println(tempFloat);
		j = (int) tempFloat;
		System.out.println("Normal Int:".concat("akdfjsndl") );
		boolean some = true;//boolean data Type
		System.out.println(some); 
		
		int k = 5;
		int l = 6;
		int s = k %l;//5
		s+=2;//7
		s = s+2;//9
		System.out.println(s > k); //boolean output from operators
		System.out.println(s > k && s < k);//boolean output from operators
		
		
		String sampleSting = "\'kjdDfls afkosd";
		System.out.println(sampleSting);
		// String related functions start here
		System.out.println(sampleSting.toLowerCase());
		System.out.println(sampleSting.toUpperCase());
		System.out.println(sampleSting.toUpperCase().indexOf("D"));
		System.out.println(sampleSting.toUpperCase().lastIndexOf("D"));
		// String related functions end here
		System.out.println("\'kjdDfls\t sdgos");//Escape Character - /t Add Tab To Output
		System.out.println("\'kjdDfls\n adfsd");//Escape Character - /n Add New Line To Output
	}
}
