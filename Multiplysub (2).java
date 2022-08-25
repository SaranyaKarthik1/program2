import java.util.*;
public class Multiplysub{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number " );
        int a=sc.nextInt();
        int i,ml;
        for(i=1;i<=10;i++)
          System.out.format("%dx%d= %d\n",a,i,ml=i*a);
           System.out.println("Enter the number " );
        int a1=sc.nextInt();
           int j,m2;
            for(j=1;j<=10;j++)
          System.out.format("%d-%d= %d\n",a1,j,m2=a1-j);
        
    }
}