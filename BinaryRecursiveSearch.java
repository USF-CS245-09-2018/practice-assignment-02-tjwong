public class BinaryRecursiveSearch implements Practice2Search{

    @Override
    public String searchName() {
        return "Binary recursive search";
    }

    @Override
    public int search(int[] arr, int target) {
        int upper = arr.length;
        int low = 0;

        if(low > upper) {
            return -1;
        }
        int mid = (low + upper)/2;
        if(arr[mid] == target){
            return mid;
        } else if(target < arr[mid]) {
            upper = mid - 1;
            return search(arr, target, low, upper);
        }
        return -1;
    }

    /*
        Helper method that allows you to call the search method recursively
       * @param arr     array of int from original search function
       * @param target  the int that is being searched for
       * @param low     the lower end
       * @param upper   the higher end of the search
     */
    private int search(int[] arr, int target, int low, int upper){
            if(low > upper) {
                return -1;
            }

            int mid = (low + upper)/2;
            if(arr[mid] == target){
                return mid;
            } else if(target < arr[mid]){
                upper = mid-1;
                return search(arr, target, low, mid-1);
            } else {
                return search(arr, target,low, mid+1);
            }
    }
}
