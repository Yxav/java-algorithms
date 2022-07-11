import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static List<Integer> selectionSort(List<Integer> list){
        List<Integer> newList = new ArrayList<>(list.size());
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(list);
            newList.add(list.get(smallest));
            list.remove(smallest);
        }
        return newList;
    }

    private static int findSmallest(List<Integer> arr){
        int low = arr.get(0);
        int low_index = 0;
        for (int i=0; i < arr.size(); i++){
            if(arr.get(i) < low){
                low = arr.get(i);
                low_index = i;
            }
        }
        return low_index;
    }

}
