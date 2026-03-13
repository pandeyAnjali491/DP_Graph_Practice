import java.util.Arrays;

public class friendsPairing {
    public static long rec(int n,long dp[]){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        long res1 = rec(n-1,dp);
        long res2 = rec(n-2,dp)*(n-1);
        return dp[n] = res1 + res2;
    }
    public static void main(String[] args) {
        int n = 3;
        long dp[] = new long[n+1];
        Arrays.fill(dp,-1);
        long res =  rec(n,dp);
        System.out.println(res);
    }
}
