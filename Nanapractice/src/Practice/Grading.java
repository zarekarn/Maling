package Practice;
import java.util.Scanner;

public class Grading {
	

	public static void main(String[] args) {
	
	System.out.println("please enter your percentage");
	
	Scanner sc=new Scanner(System.in);
	int percentage=sc.nextInt();
	
	if (percentage<35)
	{
		System.out.println("Sorry! you are failed");
	
	}
	else if (percentage>=35 && percentage<=50)
	{
		System.out.println("Congress! you are Pass");
	
	}
	else if (percentage>50 && percentage<=75)
	{
		System.out.println("Congress ! you are Passed with first class ");
		
	}
	else if (percentage>75 && percentage<=100)
	{
		System.out.println("Congress! yoy are passed with fist Class");
	}
	else 
		System.out.println("please enter correct percentage");
	}

}
