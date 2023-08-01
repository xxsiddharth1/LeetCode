package Recusrion;

public class FiboFormula {
    public static void main(String[] args) {
        System.out.println(fiboformula(50));
    }

    static int fiboformula(int n){
        // for big numbers use long
        return (int) (Math.pow(((1+Math.sqrt(5))/2),n) / Math.sqrt(5));
    }
}