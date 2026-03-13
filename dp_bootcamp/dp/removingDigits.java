import java.util.*;

public class removingDigits {

    // greedy
    // public static long dig(int n) {
    // int count = 0;
    // while (n!=0) {
    // int temp = n;
    // int max = 0;
    // while (temp!=0) {
    // int dig = temp%10;
    // temp = temp/10;
    // max = Math.max(max,dig);
    // }
    // n = n-max;
    // count++;
    // }
    // return count;
    // }

    // memo
    // public static int digMax(int n,int dp[]){
    // if (n<=0) {
    // return 0;
    // }
    // if (dp[n]!=-1) {
    // return dp[n];
    // }
    // String num = n+"";
    // char dig[] = num.toCharArray();
    // int min = Integer.MAX_VALUE;
    // for (int i = 0; i < dig.length; i++) {
    // int d = dig[i]-'0';
    // if(d!=0){
    // min = Math.min(min, digMax(n-d,dp)+1);
    // }
    // }
    // return dp[n] = min;
    // }

    // tabulation
    public static int digMax(int n) {
        int dp[] = new int[n + 1];
        for (int s = 1; s <= n; s++) {
            String num = s + "";
            char dig[] = num.toCharArray();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < dig.length; i++) {
                int d = dig[i] - '0';
                if (d != 0 && d<=s) {
                    int res = (d<=s)?dp[s-d]:0;
                    min = Math.min(min,res + 1);
                }
            }
            dp[s] = min;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int dp[] = new int[(int) (1e6 + 1)];
        // Arrays.fill(dp, -1);
        // System.out.println(digMax(n, dp));

        System.out.println(digMax(n));
    }
}
