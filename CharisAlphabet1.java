import java.util.Scanner;

public class CharisAlphabet1 {
	
	public static void main(String[] args) {
		
		char ch;
	Scanner	sc= new Scanner(System.in);

		System.out.print("Please Enter any Character =  ");
	
		ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
		{
			System.out.println(ch + " is an Alphabet");
		}
		else {
			System.out.println(ch + " is Not an Alphabet");
		}
		
	}
}