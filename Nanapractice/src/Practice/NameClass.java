package Practice;
import java.util.Scannar;
import java.util.Scanner;

public class NameClass {

	public static void main(String[] args) {
		String letters;
		System.out.println("please enter Alphbhet");
		
		Scanner sc=new Scanner(System.in);
		letters=sc.next();
		
		switch(letters)
		{
		case "A":
			System.out.println("Amit");
			break;
		case "B":
			System.out.println("Balaji");
			break;
		case "C":
			System.out.println("Chandan");
			break;
		case "D":
			System.out.println("Danajay");
			break;
		case "E":
			System.out.println("Elephamt");
			break;
		case "F":
			System.out.println("Faisal");
			break;
		case "G":
			System.out.println("Ganesh");
			break;
		case "H":
			System.out.println("Hitesh");
			break;
		case "I":
			System.out.println("Injamam");
			break;
		case "J":
			System.out.println("Jay");
			break;
			default:
				System.out.println("please enter correct Alphabet");
			
			
			
			
			
		}

	}

}
