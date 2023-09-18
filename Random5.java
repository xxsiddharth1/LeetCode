public class sqrtx {
    static int sqrt(int x){
        int start = 1;
        int end = x/2;
        if(x<2){
            return x;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if((long)mid*mid>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {

    }
}
