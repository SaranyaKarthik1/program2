import java.io.*;
import java.util.Arrays;
public class Alternate{
     public static void alternatesort( int array[],int n)
    {
       
        Arrays.sort(array);
        int i=0, j=n-1;
        while(i<j)
    {
        System.out.print(array[j--] + " ");
        System.out.print(array[i++] + " ");
    }
    if(n%2!=0)
    System.out.print(array[i]);
    }
    public static void main(String[] args){
        int array[]={1,2,3,4,5,6,7};
        int n=array.length;
        alternatesort(array,n);
    }
    
}
   
 