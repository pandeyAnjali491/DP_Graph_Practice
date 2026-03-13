import java.util.Arrays;

public class perfectSum {
    public static int rec(int arr[],int n,int tar,int dp[][]){
        if(n==0) {
            if(tar==0) return 1;
            return 0;
        }
        if(dp[n][tar]!=-1) return dp[n][tar];
        int incl = 0;
        if(arr[n-1]<=tar){
            incl = rec(arr,n-1,tar-arr[n-1],dp);
        }
        int excl = rec(arr,n-1,tar,dp);
        return dp[n][tar] = incl + excl;
    }
    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 10, 6, 8};
        int tar = 10;
        int n = nums.length;
        int dp[][] = new int[n+1][tar+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int res = rec(nums,n,tar,dp);
        System.out.println(res);
    }
}
