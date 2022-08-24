public class CopyArray {    
    public static void main(String[] args) {     
        int i;
              int [] a1 = new int [] {6, 7, 8, 9, 10};     
            int a2[] = new int[a1.length];  
            
          for (i = 0; i < a1.length; i++) 
          {     
            a2[i] = a1[i];     
        }      
            
        System.out.println("Elements of original array: ");  
        
        for (i = 0; i < a1.length; i++)
        {     
           System.out.print(a1[i] + " ");    
        }     
            
        System.out.println();    
            
          
        System.out.println("Elements of new array: ");  
        
        for ( i = 0; i < a2.length; i++) 
        {     
           System.out.print(a2[i] + " ");    
        }     
    }    
}    