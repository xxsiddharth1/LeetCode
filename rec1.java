package Recursion_prac;

public class Factorial {
    public static void main(String[] args) {

    }

    static int factorial(int n){
        if(n==0){
            return 1;
        }

        int fact = factorial(n-1);
        int fn = n* factorial(n-1);

        return fn;
    }
}
