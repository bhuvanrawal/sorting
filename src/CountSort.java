import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhuvan on 25/12/14.
 */
public class CountSort {
    public static void countSort(List<Integer> array){
        List<Integer> list = new ArrayList<Integer>(256);
        int i = 0;
        while(i < 256){
            list.add(i, 0);
            i++;
        }
        for (i=0;i<array.size();i++){
            list.set(array.get(i), list.get(array.get(i)) + 1);
        }
        int j = 0;
        for (i=0; i< array.size() ;j++){
            for(;j< array.size();j++) {
                if(list.get(j)!=0) {
                    break;
                }
            }
            for(int k=list.get(j);k>0;k--){
                array.set(i,j);
                i++;
            }
        }
    }
}
