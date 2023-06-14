import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] arr = new int[N];

            long chef = 0;
            long child = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            // Let's sort the array so that items with the least weight are at front
            Arrays.sort(arr);

            // To ensure child gets the smallest of the group i.e. one with fewer items
            int g = Math.min(K, N - K);
            // now add the items for child
            for (int i = 0; i < g; i++) {
                child += arr[i];
            }
            // now add remaining items for chef
            for (int i = g; i < N; i++) {
                chef += arr[i];
            }
            long result = chef - child;
            System.out.println(result);
            t--;
        }
    }
}