import java.util.Scanner;

public class BackJoon_2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[] arr = new int[N];

        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            arr [i] = sc.nextInt();
        }

        for(int i=0; i<=N-D; i++) {
            int sum = 0;
            for(int j=i; j<i+D; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }    
}
