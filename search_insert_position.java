public class search_insert_position {
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if (target==arr[mid]){
                return mid;
            }
//            else if(target != arr[mid]){
//                return mid-1;
//            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target =2;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

}
