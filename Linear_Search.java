public class Linear_Search {

    static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i; // it will return the position of the target
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,23,4,55,6,11};
        int target = 23;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
}





//public class Linear_Search{
//    static int search(int[] arr, int target){
//
//        for(int i = 0; i<arr.length; i++){
//            int element = arr[i];
//            if(element == target){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int target = 7;
//
//        int ans = search(arr,target);
//        System.out.println(ans);
//    }
//}




































