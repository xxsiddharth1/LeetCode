public class Binary_Search {
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
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 13;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}


//
//
//
//public class Binary_Search {
//    static int binarySeach(int[] arr, int target){
//        int start = 0, end = arr.length;
//
//        while(start<=end) {
//            int mid = start + (end - start) / 2;
//                if (target < arr[mid]) {
//                    end = mid-1;
//                } else if (target > arr[mid]) {
//                    start = mid+1;
//                } else if (target == arr[mid]) {
//                    return mid;
//                }
//
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//        int target = 8;
//
//        int ans = binarySeach(arr,target);
//        System.out.println(ans);
//    }
//}
//
//
//
//






















