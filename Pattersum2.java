public class Pattersum2{
    public static void main(String[] args){
        int row=9;
        for(int i=0;i<row;i++){
        
            for(int j=0;j<=i;j++)
            {
            System.out.print(" " );
            
        }
        int val=9;
        while(val>=1)
        {
            for(int j=0;j<row-i;j++)
        {
            System.out.print(val+" ");
            
        }
         System.out.println();
         val--;
         for(int j=0;j<=i;j++)
            {
            System.out.print( " " );
            
        }
        }
        
       
    }
    }
}