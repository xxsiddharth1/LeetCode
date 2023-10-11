import java.util.Random;
import java.util.Scanner;

public class GuessnumhighLow {
   static public int guessNumber(int n) {
       int[] num= new int[n];
       for(int i=1;i<n;++i){
           num[i] = i;

       }
       int pick = 6;

        int start = 1;
        int end = num.length;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(pick<num[mid]){
                end=mid-1;
            }
            else if(pick>num[mid]){
                start=mid+1;
            }
            else if (pick==num[mid]){
                return mid;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        System.out.println("Enter the the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ans = guessNumber(n);
        System.out.println(ans);

    }
}


