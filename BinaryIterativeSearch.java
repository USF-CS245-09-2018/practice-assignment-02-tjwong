public class BinaryIterativeSearch implements Practice2Search {

    @Override
    public String searchName() {
        return "Binary iterative search";
    }

    @Override
    public int search(int[] arr, int target) {
       int min = 0;
       int max = arr.length;

       while(min < max){
           int middle = (min + max)/ 2;

           if(arr[middle] == target) {
               return middle;
           } else if(target > arr[middle]){
               min = middle + 1;
           } else {
               max = middle - 1;
           }
       }
        return -1;
    }
}
