public class LinearSearch_Imp {
    public static void main(String[] args) {

        int[] test_array = {9, 6, -1, 67, 89, 900, 21, 6};
        //call LinearSearch function
        System.out.println("The value was found at " + LinearSearch(test_array, 800));
    }
    //Linear Search Implementation
    public static int LinearSearch(int[] array, int targetValue){
        for(int i=0; i<array.length; i++){
            if (array[i] == targetValue){
                return i;
            }
        }
        //value is not in array
        return -1;
    }
}


