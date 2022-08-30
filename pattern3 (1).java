import java.util.*;
public class pattern3{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
         System.out.println(" enter the number ");
         int n=sc.nextInt();int k;char c='*';
         for(int i=1;i<=n;i++)
         {
             System.out.print(c+" " );
             for(int j=n;j<=n-2;j--);
             System.out.println(c+" " );
             System.out.println( );
         
         for(k=1;k<=i-1;k++,n--){
         System.out.print(c+" " );
         }
         }
    }
}