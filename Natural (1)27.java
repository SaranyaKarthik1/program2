import java.util.*;
public class Natural
{
    public static void main(String[] args){
        int n, sum=0;
        System.out.print("Enter the number " );
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            System.out.println("The sum is " +sum);
            System.out.println();
        }
        int temp;
        //=sum;int n1=sum;
        temp=sum;
       
           System.out.println(" The largest digit is " +temp);
           //temp=temp/n;
        
        //System.out.println(temp%10);
           //System.out.print(temp);
          
        
        
    }
}