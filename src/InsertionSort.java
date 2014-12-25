import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhuvan on 25/12/14.
 */
public class InsertionSort {
    public static List<Integer> insertionSort(final List<Integer> unsortedList){
        List<Integer> sortedList = new ArrayList<Integer>();
        int i=0;
        for(int number : unsortedList){
            if (i == 0){
                sortedList.add(number);
            } else {
                if (sortedList.get(i-1) < number){
                    sortedList.add(i,number);
                }
                else {
                    for (int j=0;j < i;j++){
                        if (number < sortedList.get(j)){
                            sortedList.add(j,number);
                            break;
                        }
                    }
                }
            }
            i++;
        }
        return sortedList;
    }
}
