public class Reverseanddifference{
    public static void main(String args[]){
        int n=12345;
       int reverse =0;
       while(n!=0){
           int rem=n%10;
           reverse=reverse*10+rem;
           n=n/10;
          
           
       }
       System.out.println("The reverse is " +reverse);
       int diff=n-reverse;
        System.out.println("The difference is " +diff);
       
    }
    
}