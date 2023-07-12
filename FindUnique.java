public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,3,4,6};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique^=n;
        }
        return unique;
    }
}
