public class SimpleBinarySearch {
    public static Integer binarySeacrh(int[] myList, int item){
        int low = 0;
        int high = myList.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            int guessNumber = myList[mid];

            if(guessNumber == item) return mid;
            if(guessNumber < mid){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
