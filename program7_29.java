 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Program7
{
  
// Function to print given  
// string in cross pattern
static void pattern(String str, int len)
{
      
    // i and j are the indexes of 
    // characters  to be displayed 
    // in the ith iteration i = 0 
    // initially and go upto length 
    // of string j = length of string  
    // initially in each iteration 
    // of i, we increment i and decrement 
    // j, we print character only
    // of k==i or k==j
    for (int i = 0; i < len; i++)
    {
        int j = len -1 - i;
        for (int k = 0; k < len; k++)
        {
            if (k == i || k == j)
                System.out.print(str.charAt(k));
                  
            else
                System.out.print(" ");
        }
        System.out.println(""); 
        
    }
}
  
// driver code
public static void main(String[] args)
{
    String str = "54321";
    int len = str.length();
    pattern(str, len);
}
}