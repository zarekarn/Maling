package Practice;
import java.util.Scanner;

public class CapitalIndia {

	public static void main(String[] args) {
		String countryName, stateName;
		System.out.println("Please Enter the country Name");
		
		Scanner sc=new Scanner(System.in);
		countryName=sc.next();
		
		if (countryName.contains("India"))
		{
			System.out.println("welcome, you are Indian");
			System.out.println("please enter State Name");
			stateName=sc.next();
			
			if (stateName.contains("MH"))
			{
				System.out.println("Jay Maharashtra, Capital is Mumbai");
			}
			else if (stateName.contains("AP"))
			{
				System.out.println("Jay Balaji Capital is Hydrabad");
			}
			else if (stateName.contains("Bihar"))
			{
				System.out.println("Jay Bihar, Capital is Patna");
			}
			else 
			{
				System.out.println("please enter correct state");
			}
			}
			
			else 
			{
				System.out.println("please enter correct country Name as India");
		
			}

	}

}
