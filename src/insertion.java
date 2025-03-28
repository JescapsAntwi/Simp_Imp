import java.util.Arrays;

//insertion sort implementation
public class insertion {
    public static void main(String[] args) {
        int[] my_array = {-1, 300, 2, 38, 91, 17, 43, -4, -98};
        System.out.println("Sorted Array= " + Arrays.toString(insertionSort(my_array)));
    }

    //insertion sort method
    public static int[] insertionSort(int[] arrays) {
        //outer loop starts from 1
        for (int i=1; i <arrays.length; i++){
            int insert_index = i;
            int current_value = arrays[i];
            for (int j= i-1; j >= 0; j--) {
                if (arrays[j] > current_value) {
                    arrays[j+1] = arrays[j];
                    insert_index = j;
                }
                else {
                    break;
                }
            }
            arrays[insert_index] = current_value;
        }
        return arrays;
    }
}




