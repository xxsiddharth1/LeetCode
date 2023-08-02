package Recursion;

import java.util.ArrayList;

// linear Search in Recursion
public class Find {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,6};
        System.out.println(find(arr,4, 0));
        System.out.println(findIndex(arr,4,0));
        System.out.println(findLastIndex(arr,4,arr.length-1 ));
        findAllInt(arr,4,0);
        System.out.println(list);
    }

    static boolean find(int[] arr, int target , int index){
        if(index==arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }
    }

    static int findLastIndex(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findLastIndex(arr,target,index-1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllInt(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }

        findAllInt(arr,target,index+1);
    }
}
