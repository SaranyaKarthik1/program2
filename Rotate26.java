
public class Rotate{
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        int first=a[0];
        System.out.println("Input array: " );
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
            
        }
       // int first=a[0];
        for(int j=0;j<a.length-1;j++)
        {
            a[j]=a[j+1];
            a[a.length-1]=first;
            System.out.println("output array: ");
        }
            for(int i=0;i<a.length;i++)
        {
           
            System.out.println(a[i]);
            
            
        }
        }
    
}