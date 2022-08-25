public class Alpha2
{
    public static void main(String[] args){
        int n=3;
        char ch='C';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(ch + " ");
                
        }
        ch--;
            System.out.println();
        }
    }
}