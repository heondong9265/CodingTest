/*
 * 문제 : 수 N개가 주어질 때 i번째 수에서 j번째 수까지의 합을 구하는 프로그램
 * 입력 :
 *  첫번째 줄 → 수의 개수, 합을 구해야하는 개수
 *  두번째 줄 → 수 N개
 *  세번째 줄부터 → M개의 줄에합을 구해야하는 구간 i와 j
 * 
 * example
 * 입력 : 5 3
 * 입력 : 1 2 3 4 5
 * 1 2 → 3 (출력 값)
 * 2 4 → 9 (출력 값)
 * 5 5 → 5 (출력 값) 
 */

/*
 * 수도코드
 * dataNo(데이터 개수), quizNo(질의 개수) 저장
 * for(dataNo만큼 반복){
 *  합 배열 생성하기 S[i] = S[i-1] + A[i]
 * }
 * for(quizNo만큼 반복){
 *  질의 범위 받기(i ~ j)
 *  구간 합 출력 S[j] - S[i-1]
 * }
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon_11659{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int dataNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long S[] = new long[dataNo+1];
        
        // 합 배열 S 선언
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= dataNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // 구간 합 구하기
        for(int q = 0; q < quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(i + "와 " + j + "의 구간 합 = " + (S[j] - S[i-1]));
        }
    }
}
