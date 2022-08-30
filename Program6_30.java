public class Program6_30{
    public static void main(String[] args){
        int num=101;
        int i;
        int j;
        int count=1;
        for(i=num;i<=104;i++){
            count=count+1;
            System.out.println("Group : " +count);
             for(j=i;j<=120;j=j+4){
            
            System.out.println(j);
        }
        }
    }
}
