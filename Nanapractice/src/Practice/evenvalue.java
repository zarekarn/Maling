package Practice;
import java.util.Scanner;

public class evenvalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int i=sc.nextInt();
		
		if (i%2==0)
		{
			System.out.println("your number is even");
		}
		else
		{
			System.out.println("your number is odd");
		}

	}

}
