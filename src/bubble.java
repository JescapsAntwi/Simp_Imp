//bubble sort implementation
import java.util.Arrays;
public class bubble {
    public static void main(String[] args) {
        int[] my_array = {-1, 300, 2, 38, 91, 17, 43, -4, -98};
        System.out.println("Sorted array " + Arrays.toString(bubbleSort(my_array)));
    }

    //bubble sort method
    public static int[] bubbleSort(int[] arrays) {
        //outer loop
        for (int i=0; i<arrays.length - 1; i++ ){
            for (int j =0; j <arrays.length - i - 1; j++){
                if (arrays[j] > arrays[j + 1]) {
                    //swap elements
                    int value = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j + 1] = value;
                }
            }
        }
        return arrays;
    }
}


