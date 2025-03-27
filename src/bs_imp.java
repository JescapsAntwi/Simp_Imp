public class bs_imp {
    public static void main(String[] args) {
        int[] my_array = {34, 51, 32, 76, -1, 42, 30};

        //binary search
        public static int binarySearch(int[] arrays, int targetValue) {

            //first value in the array
            int left = 0;

            //last value in the array
            int right = arrays.length - 1;

            while (left <= right) {
                //compute index of middle value
                int mid = (left + right) / 2;

                if (arrays[mid] == targetValue) {
                    return mid;
                }
                if (arrays[mid] < targetValue) {`
                  left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
}


//def binarySearch(arr, targetVal):
//left = 0
//right = len(arr) - 1
//
//        while left <= right:
//mid = (left + right) // 2
//
//        if arr[mid] == targetVal:
//        return mid
//
//        if arr[mid] < targetVal:
//left = mid + 1
//        else:
//right = mid - 1
//
//        return -1
//
//myArray = [1, 3, 5, 7 , 9, 11, 13, 15, 17, 19]
//myTarget = 15
//
//result = binarySearch(myArray, myTarget)
//
//if result != -1:
//print("Value",myTarget,"found at index", result)
//else:
//print("Target not found in array.")
