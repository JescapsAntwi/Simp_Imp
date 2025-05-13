public class LinearSearch_Imp {
    public static void main(String[] args) {

        int[] test_array = {9, 6, -1, 67, 89, 900, 21, 6};
        int target = 900;
        int result = LinearSearch(test_array, target);
        if(result != -1){
        }
        //call linearSearch function
        System.out.println("The value was found " + target + " was found at index " + result);
    }
    //Linear Search Implementation
    public static int LinearSearch(int[] array, int targetValue){
        for(int i=0; i<array.length; i++){
            if (array[i] == targetValue){
                return i;
            }
        }
        //valu
        return -1;
    }
}
//Implement bubble sort on the array and then find the index of any value in the array
//Next up; sort using bubble sort and search for a value in the array using linear search
//Next implementation


