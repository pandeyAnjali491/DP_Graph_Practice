package recursion;

public class binaryString {
    public static void bin(int n,int ls,String s){
        if (n==0) {
            System.out.println(s);
            return;
        }
        if(ls!=1) bin(n-1,1, s+"1");
        bin(n-1,0, s+"0");
    } 
    public static void bin2(int n,int ls,StringBuilder s){
        if (n==0) {
            System.out.println(s);
            return;
        }
        // choice 1 - 0
        bin2(n-1,0, s.append(0));
        s.deleteCharAt(s.length()-1);
        // choice 2 - 1
        if(ls!=1) {
            bin2(n-1,1, s.append(1));
            s.deleteCharAt(s.length()-1);
        }
    } 
    public static void main(String[] args) {
        int n = 3;
        // bin(n,-1, "");
        bin2(n,-1, new StringBuilder(""));
    }
}
