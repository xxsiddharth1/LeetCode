import java.util.Scanner;

public class SumUntil0 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        do {
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            sum = sum + num;
        }
        while (num != 0);{
            System.out.println(sum);
        }
    }
}