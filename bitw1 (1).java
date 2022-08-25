import java.util.Scanner;


public class bitw1
{
	
	
public static void main(String[] args) 
{
		
		
char ch;
	
Scanner	sc= new Scanner(System.in);

		
System.out.print("Please Enter any Character =  ");
	
		
ch = sc.next().charAt(0);//charAt(0) function returns the first //character in that string
		
		
if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) //bitwise operators functions
		
{
			
System.out.println(ch + " is an Alphabet");
		
}
		else
 {
			
System.out.println(ch + " is Not an Alphabet");
		
}
		
	
}

}