public class Valid_PerfectSquare {

    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sqr = mid * mid;
            if (sqr < num) {
                end = mid - 1;
            } else if (sqr > num) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }


}