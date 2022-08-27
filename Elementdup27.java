 public class Elementdup{
 public static void main(String[] args){
        int a[]={2,2,1,5,5,6,7,8};
        //int b[]=a.length();
        //int n;
       for(int i=0;i<a.length;i++){
           int b=a[i];
           int count=0;
           for(int j=0;j<a.length;j++){
           if(a[j]==b)
           {
               ++count;
           }
       }
       if(count==1){
           System.out.println(a[i]);
       }
       }
    }
}
