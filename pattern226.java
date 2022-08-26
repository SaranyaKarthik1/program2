import java.util.*;
public class pattern2{
    public static void main(String[] args)
    {
        int num,i,s=0,sum=0;
        Scanner sc=new Scanner(System.in);
         System.out.println(" enter the number ");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            s=s*10+1;
            System.out.print(s+ "+");
            sum=sum+s;
        }
        System.out.println();
        System.out.println("The sum is" +sum);
        
    }
}
