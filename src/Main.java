import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhuvan on 25/12/14.
 */
public class Main {
    // This is the driver method to test the Sorting methods
    public static void main(String [] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(9);
        List<Integer> testList = new ArrayList<Integer>(list);
        BubbleSort.sort(testList);
        System.out.println(testList);
        testList = new ArrayList<Integer>(list);
        System.out.println(InsertionSort.insertionSort(list));
        testList = new ArrayList<Integer>(list);
        QuickSort.quickSort(testList);
        System.out.println(testList);
        testList = new ArrayList<Integer>(list);
        CountSort.countSort(testList);
        System.out.println(testList);
        testList = new ArrayList<Integer>(list);
        System.out.println(MergeSort.mergeSort(testList));
        System.out.println(testList);
    }

}
