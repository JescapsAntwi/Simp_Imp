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