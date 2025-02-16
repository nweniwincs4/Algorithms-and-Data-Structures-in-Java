
import java.util.Arrays;

public class BinarySearchTest {
    public static int binarySearch(int [] arr, int key){
        int low = 0;
        int high = arr.length-1; 
        while(low<=high){
            int midIndex = (low+high)/2;
            if (key == arr[midIndex]){
                return midIndex;
            }
            else if (key<arr[midIndex]){
                high = midIndex-1;
            }
            else if (key>arr[midIndex]){
                low = midIndex+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,6,8,9,13,20};
        int searcKey = 13;
        Arrays.sort(arr);
        System.out.println("Start.......");
        System.out.printf("The search key : %d is found at index %d \n" , searcKey, binarySearch(arr, searcKey));
        System.out.println("Finish.......");
    }
    
}