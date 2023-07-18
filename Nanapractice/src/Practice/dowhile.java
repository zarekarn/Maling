package Practice;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your number");
		int n=sc.nextInt();
		
		int i=1;
		int sum;
		do
		{
			sum=n*i;
			System.out.println(sum);
			i=i+1;
			
		}while(i<=10);

	}

}
