import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        if(input%2==0) {
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
