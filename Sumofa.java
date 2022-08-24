public class Sumofa {  
    public static void main(String[] args) {  
        int [] a= new int [] {6, 7, 8, 9, 10};  
        int sum = 0; int i; 
       for (i = 0; i < a.length; i++) {  
           sum = sum + a[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}  