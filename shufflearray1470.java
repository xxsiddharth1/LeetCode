public class shufflearray1470 {
    static int[] shuffle(int[] nums, int n){
        int m=n;
        int[] ans = new int[2*n];
        for(int i=0,j=0;i<(2*m);i++,j++){
            ans[i] = nums[j];
            ans[i+1] = nums[n];
            n++;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int n = (nums.length)/2;

        int[] ans = shuffle(nums, n);
        System.out.println(ans);
    }
}
