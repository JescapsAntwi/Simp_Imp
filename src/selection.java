import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] my_array = {-1, 300, 2, 38, 91, 17, 43, -4, -98, 54};
        System.out.println("Sorted array: " + Arrays.toString(selectionSort(my_array)));
    }

    //selection sort implementation
    public static int[] selectionSort(int[] arrays){
        for(int i=0; i<arrays.length; i++){
            int min_index = i;
            for (int j=i+1; j <arrays.length; j++) {
                if(arrays[j] < arrays[min_index]){
                    min_index = j;

                }
//                if(arrays[j] > arrays[j+1]) {
//                    int temp = arrays[j];
//                    arrays[j] = arrays[j+1];
//                    arrays[j+1] = temp;
//                }

            }
            if(min_index != i){
                int temp = arrays[i];
                arrays[i] = arrays[min_index];
                arrays[min_index] = temp;
            }
        }
        return arrays;
    }
}



// #This is an implementation of the selection sort algorithm
//
//'''
//An outer loop that controls how many times the inner loop must run
//
//An inner loop that goes through the array,
//
//finds the lowest value, and moves it to the front of the array.
//
//This loop must loop through one less value each time it runs.
//        '''
//
//my_array = [64, 34, 25, 12, 22, 11, 90, 5]
//
//n = len(my_array)
//
//for i in range(n):
//min_index = i
//    for j in range(i+1, n):
//        if my_array[j] < my_array[min_index]:
//min_index = j
//my_array[i], my_array[min_index] = my_array[min_index], my_array[i]
//
//print("Sorted array:", my_array)
//
//#Time complexity: O(N(N-1)/2)
//        #O(N^2)