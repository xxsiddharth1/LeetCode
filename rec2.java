package Recursion_prac;


public class Print_10to1 {
    public static void main(String[] args) {
        //PrintDecr(10);
        PrintInc(10);
    }

    // displaying number from n to 1
    static void PrintDecr(int n){

//      Now in this it will call and endless time of n-1 Function,
//        System.out.println(n);
//        display(n-1);

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        PrintDecr(n-1);

    }

    // displaying from 1 to N
    static void PrintInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintInc(n-1);
        System.out.println(n+" ");
    }

}
