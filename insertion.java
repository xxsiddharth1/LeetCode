import java.util.Arrays;

public class insertion {
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void insertionSort(int[] arr){
        for(int i = 0; i<=arr.length-2;i++){
            for (int j = i+1; j> 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
