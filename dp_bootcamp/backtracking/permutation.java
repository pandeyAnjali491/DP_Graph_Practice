package dp_bootcamp.backtracking;

public class permutation {
    public static void permut(String s,int pos,String res){
        if(pos==0) {
            System.out.println(res);
            return;
        }
        for(int j=0;j<s.length();j++){
            String rem = s.substring(0, j)+s.substring(j+1);
            permut(rem,pos-1,res+s.charAt(j));
        }
    }
    public static void main(String[] args) {
        String s ="abc";
        permut(s,s.length(), "");
    }
}
