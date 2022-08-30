import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for foactorial " );
        int n=sc.nextInt();
        int f=1,sum=0;
        for(int i=1;i<=n;i++)
        {
             f=f*i;
        }
        System.out.println("The factorial is "+f);
        //System.out.println("The sum of factorial is sum+f);
    }
}