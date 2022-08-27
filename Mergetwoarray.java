 import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Mergetwoarray {

   /**
    * Merge Two Array & Remove Duplicates
    */
   public static void main(String[] args) {
      String array1[] = { "2,4,5,6,7,9,10,13" };
      String array2[] = { "2,3,4,5,6,7,8,9,11,15" };

      Set<String> list3 = new LinkedHashSet<String>();
      list3.addAll(Arrays.asList(array1));
      list3.addAll(Arrays.asList(array2));
      String array3[] = list3.toArray(new String[list3.size()]);

      System.out.println("Array1 " + Arrays.toString(array1));
      System.out.println("Array2 " + Arrays.toString(array2));
      System.out.println("Array3 " + Arrays.toString(array3));

}

   }
   /* For removing duplicate entries, We are adding all items into a LinkedHashSet, which will remove the duplicate entries.

Set is a collection that contains no duplicate elements.*/

