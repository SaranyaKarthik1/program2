import java.util.Scanner;

class chartest{
     Scanner sc=new Scanner(System.in);
     char c1=sc.next().charAt(0);
}
public class Test {
    public static void main(String args[]) {
       
        System.out.println(" Input a character ");
        chartest c=new chartest();//calling a class by using class //name
        for(char d=c.c1+1;d<='y';d++){
            System.out.println(" The next character is");
            c.c1++;
        }
        
   
    }
}