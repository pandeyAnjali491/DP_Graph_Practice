package dp_bootcamp.backtracking;

public class powerSet {
    // print all subsets(powerset=all subsets)
    public static void printSet(String org,int i,String res){
        if(i==org.length()) {
            if (res.length()==0) {
                System.out.println("empty");
            }
            else System.out.println(res);
            return;
        }
        // if yes
        printSet(org, i+1, res+org.charAt(i));
        // no 
        printSet(org, i+1, res);
    }
    public static void main(String[] args) {
        String s = "abc";
        printSet(s, 0, "");
    }
}
