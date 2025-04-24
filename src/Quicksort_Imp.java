//this is an implementation of the quicksort algorithm
//test of how the algorithm works
// int[] sample_array = {3, 1, 6, 9, 8, 4, 5, -1};

//sorted_array = {-1, 1, 3, 4, 5, 6, 8, 9}

// pivot = 3
// left_array = {1, -1}
//right_array = {6, 9,8,4,5}


//pivot = 1
//left_array = {-1}
//right_array = {}


//pivot = {6}
//left_array = {4, 5}
//right_array = {9, 8}

//pivot = {4}
//left_array = {}
//right_array = {5}

//pivot = {9}
//left_array = {8}
//right_array = {}

public class Quicksort_Imp {
    public static void main(String[] args) {
        //array to be sorted in ascending o
        int[] numbers = {9, 3, 7, 1, 5, 8, 2, 6, 4};


        System.out.println("Original array:");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("\nSorted array:");
        printArray(numbers);

    }
    //create function to handle quicksort implementation
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        //traverse through all elements in subarray
        for (int j=low; j <high; j++){
            if(arr[j] < pivot){
                i++;

                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);

        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


//def partition(array, low, high):
//pivot = array[high]
//i = low - 1
//
//        for j in range(low, high):
//        if array[j] <= pivot:
//i += 1
//array[i], array[j] = array[j], array[i]
//
//array[i+1], array[high] = array[high], array[i+1]
//        return i+1
//
//def quicksort(array, low=0, high=None):
//        if high is None:
//high = len(array) - 1
//
//        if low < high:
//pivot_index = partition(array, low, high)
//quicksort(array, low, pivot_index-1)
//quicksort(array, pivot_index+1, high)
//
//my_array = [64, 34, 25, 12, 22, 11, 90, 5]
//quicksort(my_array)
//print("Sorted array:", my_array