public class sqrt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 9; // target is the number whose sqrt will be printed

        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start = 1;
        int end = target/2; //cause the sqrt will be less then or equals to the half of the target

        if(target<2){           // cause sqrt of 1 is 1
            return target;
        }
        while(start<=end){
            int mid = start+(end-start)/2;

            if(mid*mid>target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return end;
    }
}
