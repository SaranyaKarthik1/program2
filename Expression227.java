public class Expression2 {
    public static void main(String args[]) {
       
      int a=28;
      int a1=(a++ + ++a + -a+ -a);
       System.out.println("The expression x++*2+3*-x = " +a1);
    }
}