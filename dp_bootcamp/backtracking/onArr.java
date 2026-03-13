package dp_bootcamp.backtracking;

public class onArr {
    public static void fill(int n, int arr[],int val) {
        if (n < 0) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
            return;
        }
        arr[n] = val;
        fill(n - 1, arr,val-1);
        arr[n] = arr[n] - 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        fill(arr.length - 1, arr,5);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
