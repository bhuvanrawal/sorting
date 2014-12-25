import java.util.List;

/**
 * Created by bhuvan on 25/12/14.
 */
public class BubbleSort {
    public static void sort(List<Integer> array){
        int i = 0;
        int j = array.size() -1;
        boolean isSwapped = false;
        do {
            isSwapped = false;
            for (i = 0; i < j; i++){
                if (array.get(i)>array.get(i+1)){
                    int tmp = array.get(i);
                    array.set(i,array.get(i+1));
                    array.set(i+1, tmp);
                    isSwapped = true;
                }

            }
            j--;
        } while (isSwapped);

    }
}
