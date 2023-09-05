package Sorting;

import java.util.Arrays;

public class bubblesort {
    static void bubble(int[] arr){
        boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j< arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
