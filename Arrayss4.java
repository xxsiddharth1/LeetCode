package Arrays;

import java.util.*;

class Solution {

    public static void main(String args[]) {

        // Write code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        rotateArray(k,n,arr);
        System.out.println(arr);
    }

    public static void rotateArray(int k, int n, int[] arr){
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<k;i++){
            List.add(arr[i]);
        }

        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }

        for(int i=n-k;i<n;i++){
            arr[i] = List.get(i - (n - k));
        }
    }
}