import java.util.Arrays;
public class ArrayMethods {
    public static void main(String[] args) {
        //creating an array
        int[]numbers={5,2,8,1,9};
        //iterating through the array using for loop
        System.out.println("array elements:");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        //sorting the array
        Arrays.sort(numbers);
        //display the sorted array
        System.out.println("sorted array:");
        System.out.println(Arrays.toString(numbers));
    }
}
