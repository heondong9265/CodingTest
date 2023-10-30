// 벨로그 정리
// https://velog.io/@beheon/%EA%B5%AC%EA%B0%84-%ED%95%A9-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%982

public class PrefixSum2_example {
    public static void main(String[] args){
        int[][] A = {
            {0, 0, 0, 0, 0},
            {0, 1, 2, 3, 4},
            {0, 5, 6, 7, 8},
            {0, 1, 2, 3, 4},
            {0, 5, 6, 7, 8}
        };

        System.out.println("숫자 배열 A");
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        int[][] D = new int[A.length][A.length];
        // 구간 합 배열 채우기
        for(int i = 1; i < A.length; i++) {
            for(int j = 1; j < A.length; j++) {
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }

        System.out.println("\n구간 합 배열 D");
        for(int i = 0; i < D.length; i++) {
            for(int j = 0; j < D.length; j++) {
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
