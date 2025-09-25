package Reviews;
import java.util.ArrayList;

public class FindOdd {
    public static int findIt(int[] a) {

      ArrayList<Integer> list = new ArrayList<Integer>(); // create list to store unique numbers found
      ArrayList<Integer> count = new ArrayList<Integer>(); // creates parallel list to store counts of numbers.

      for(int number : a){    // accounts each number and their counts
        if(list.contains(number)){
          int index = list.indexOf(number);
          count.set(index, count.get(index)+1);
        }else{
          list.add(number);
          count.add(1);
        }
      }
      // checks which element in count is odd and therefor appears an odd number of times in the array.
      for(int index = 0; index < count.size(); index++){
        if(count.get(index) % 2 != 0){
          return list.get(index);
        }
      }
      return 0;
    }
}
