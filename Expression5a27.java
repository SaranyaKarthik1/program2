public class Expression5a {
    public static void main(String args[]) {
       
      int a=5,b=6;
      int x1=(++a-b--);
      System.out.println(" The valuse of expression is ="  +x1);
      int x2=(a%b++);
      System.out.println(" The valuse of expression is ="  +x2);
      int x3=(a*=b+5);
      System.out.println(" The valuse of expression is ="  +x3);
      int x4=(69>>>2);
       System.out.println(" The valuse of expression is ="  +x4);
    }
}