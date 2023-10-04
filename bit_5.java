public class SubtractTheProdSumInanINT {
   
    static int diffrence(int n){
        int sum = 0;
        int prod = 1;

        while(n>0){
            prod *= n%10;
            sum += n%10;

            n = n/10;
        }
        return prod-sum;
    }
    public static void main(String[] args) {
        int n = 4421;

        System.out.println(diffrence(n));
    }

}
