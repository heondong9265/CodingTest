// TODO : 구간 합 알고리즘(2)

// 벨로그 정리
// https://velog.io/@beheon/%EA%B5%AC%EA%B0%84-%ED%95%A9-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%982

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        // 2차원 배열[S] 생성
        int[][] S = new int[N+1][N+1];
        for(int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 1; j <= N; j++) {
                S[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        // 구간 합 배열[D] 생성
        int D[][] = new int[N+1][N+1];
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + S[i][j];
            }
        }

        // 지정된 영역의 범위 합계 구하기
        for(int i = 0; i < quizNo; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int result = D[x2][y2] - D[x2][y1-1] - D[x1-1][y2] + D[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
