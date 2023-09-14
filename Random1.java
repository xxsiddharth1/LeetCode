package Random;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to change");
        n = sc.nextInt();

        for(i=0;n>0;i++){
            arr[i] = n%2;
            n=n/2;
        }

        for (i=i-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
