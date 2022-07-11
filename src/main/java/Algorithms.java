import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {

    public static void main(String[] args) {
        int[] myList = {1,2,5,6,8};
        System.out.println(SimpleBinarySearch.binarySeacrh(myList, 6));
        System.out.println("______________________________\n\nSelection sort");
//        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(SelectionSort.selectionSort(arr)); //[2, 3, 5, 6, 10]

    }
}
