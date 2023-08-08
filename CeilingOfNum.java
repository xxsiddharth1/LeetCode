// Ceiling of a number is the smallest element in a array which is greater or equals to the target
public class CeilingOfNum {

    static int ceiling(int [] arr, int target){
        int start =0;
        int end = arr.length;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
        return start;
    }


    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9,10};
        int target = 8;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

}
