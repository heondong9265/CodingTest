// TODO : 나머지 합 구하기

// 벨로그 정리
// https://velog.io/@beheon/%EB%82%98%EB%A8%B8%EC%A7%80-%ED%95%A9-%EA%B5%AC%ED%95%98%EA%B8%B0

import java.io.IOException;
import java.util.Scanner;

public class BackJoon_10986 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;

        // 합 배열 S 생성
        S[0] = sc.nextInt();
        for(int i = 1; i < N; i++) {
            S[i] = S[i-1] + sc.nextInt();
        }

        // 합 배열의 모든 값에 % 연산 수행
        for(int i = 0; i < N; i++) {
            int remainder = (int)(S[i] % M);
            // 0 ~ i 까지의 구간 합 자체가 0일 때 정답(asnwer)에 더하기
            if(remainder == 0)
                answer ++;
            // 나머지가 같은 인덱스의 개수 카운팅하기
            C[remainder]++;
        }

        for(int i = 0; i < M; i ++) {
            if (C[i] > 1) {
                // 경우의 수 구하기
                answer = answer + (C[i] * (C[i] -1) / 2);
            }
        }
        System.out.println(answer);
    }
}
