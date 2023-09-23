/*
 *  *** 문제 ***
 * 새로운 평균을 구하고자 한다.
 * 자기 점수 중 최댓값을 고른다.
 * 최댓값을 M이라고 할 때 모든 점수를 점수/M*100으로 수정하였다.
 * 만약 최고점이 70점, 수학 점수가 50점이라면 수학 점수는 50/70*100이므로 71.43이다.
 * 새로운 평균을 구하는 프로그램을 만들자.
 *
 * 입력 값
 * 3 //시험을 본 과목의 개수
 * 40 80 60 // 각 과목의 시험 성적
 * 
 *  *** 문제 분석 및 풀이 ***
 * 1. 시험본 과목 개수를 입력 받는다.
 * 2. 시험본 과목의 개수만큼 배열을 생성한다.
 * 3. 생성된 배열의 크기만큼 for문을 반복 -> 각 배열에 과목의 점수들을 저장한다.
 * 4. for문을 한번 더 실행하여 각 배열 중 가장 큰 값을 max 변수에 넣는다.
 * 5. 총합 * 100 / max / N -> 새로운 평균을 구해 출력한다.
*/

 /*
 * *** 수도 코드 ***
 * N 값 입력 -> 과목 개수
 * 길이가 N인 배열 A[] 생성
 * for(배열A 길이만큼 반복) {
 *  배열의 각 요소에 과목의 점수 저장
 * }
 * for(배얼A 길이만큼 반복) {
 *  배열의 각 요소들을 1:1 비교하여 가장 큰 값을 max에 저장, 총점은 sum에 저장
 * }
 * sum * 100 / max / N
 */
import java.util.Scanner;

public class BackJoon_1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];

    for(int i = 0; i < A.length; i++) {
      A[i] = sc.nextInt();
    }
/*  */
    long sum = 0;
    long max = 0;
    for(int i = 0; i < A.length; i++) {
      sum += A[i];
      if(A[i] > max)
        max = A[i];
    }

    System.out.println(sum * 100.0 / max / N);
  }
 }