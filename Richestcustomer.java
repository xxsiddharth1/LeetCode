public class Richestcustomer {
    static int maximumWealth(int[][] accounts){
        int m = accounts.length;

        int ans = 0;
        for(int i=0;i<m;i++){
            int sum = 0;
            int n = accounts[i].length;
            for(int j=0;j<n;j++){
                sum = sum + accounts[i][j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3,},{4,5,6}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
}
