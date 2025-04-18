import java.util.Arrays;
public class Arrays_Imp {
    public static void main(String[] args) {
        //create an array strings of size 5
        String[] my_array = new String[5];
        int[] second_array = {1, 2, 3, 4, 5};

        //access elements
        my_array[2] = "John Cena";
        System.out.println("Elements of the first array are: " + Arrays.toString(my_array));
        System.out.println(second_array[1]);
    }
}



