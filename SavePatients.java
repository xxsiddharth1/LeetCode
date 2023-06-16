import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[11];
        int[] b = new int[11];
        
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; ++i) {
            b[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; ++i) {
            if (a[i] <= b[i]) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
