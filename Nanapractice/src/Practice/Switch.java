package Practice;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		String countryName;
		System.out.println("please enter country Name");
		
		Scanner sc=new Scanner(System.in);
		countryName=sc.next();
		
		switch (countryName)
		{
		case "India":
			    System.out.println("capital is Delhi");
				break;
			
		case "Pak":
			    System.out.println("Capital is Lahour");
			break;
			
		case "Aus":
			    System.out.println("capital is Sidney");
			break;
			
			default :
			   System.out.println("enter correct counrty Name");
		}	
	}
}

