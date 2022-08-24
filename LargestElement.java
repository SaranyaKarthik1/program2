public class LargestElement {  
    public static void main(String[] args) {  
  int [] arr = new int [] {35, 45, 55, 65, 75};  
     int max = arr[0];  
     for (int i = 0; i < arr.length; i++) 
     {  
             if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}  