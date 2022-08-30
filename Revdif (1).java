public class Revdif{
    public static void main(String[] args)
    {
        int i=12345, reverse=0;
        while(i!=0)
        {
            int rem=i%10;
            reverse=reverse*10+rem;
            i=i/10;
        }
        System.out.println("dfsdfdsf"+reverse);
        String s="12345",r="54321";;
        int j=Integer.parseInt(s);
       int k=Integer.parseInt(r);
         System.out.println(s-r);
    }
}