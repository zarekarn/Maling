package Practice;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your number");
		int n=sc.nextInt();
		
		int i=1;
		int mul=n;
		while(i<=10)
		{
			System.out.println(mul);
			i=i+1;
			mul = n*i;
		}

	}

}
