public class Elementsodd{
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7};
        for(int i=1;i<a.length;i=i+2){
            System.out.println("Index of the odd elements is " +i);
            System.out.println("The value is "+a[i]);
        }
    }
}