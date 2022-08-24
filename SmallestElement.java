public class SmallestElement {  
    public static void main(String[] args) {  
  int [] arr = new int [] {35, 45, 55, 65, 75};  
     int min = arr[0];  
     for (int i = 0; i < arr.length; i++) 
     {  
             if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  
}  