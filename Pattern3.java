package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int N= 5;
        for(int i=1;i<=N;i++){
            for(int j =1;j<N-i+1 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
