/*
 *  *** 문제 ***
 *  N개의 숫자가 공백 없이 써 있다.
 *  이 숫자를 모두 합해 출력하는 프로그램을 작성
 *  
 *  *** 문제 분석 및 풀이 ***
 *  1. 첫 번째 숫자를 입력 받기
 *  2. 두 번째 문자형을 입력받고, 문자 배열로 변환한다.
 *      -> 1~100 까지의 수가 띄어쓰기 없이 각각의 개별적은 숫자이므로
 *      -> 숫자형으로 받게 된다면 1092는 개별적으로 숫자를 더할 수 없는데
 *      -> 문자형으로 받게 된다면 "1092" -> 문자 '1','0','9','2' 로 받고
 *          숫자로 변환하면서 1 + 0 + 9 + 2를 할 수 있다.
 *  3. 선언된 배열의 요소들을 모두 더해 하나의 변수에 넣고 출력한다.
 */

/*
 * *** 수도 코드 ***
 * N값 입력
 * 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장
 * sNum을 다시 char []형 변수 cNum에 변환하여 저장
 * int형 변수 sum 선언
 * for(cNum 길이만큼 반복)
 * {
 *  배열의 각 원소들을 정수형으로 변환하면서 sum에 더하여 누적
 * }
 * sum 출력
 */

import java.util.Scanner;

public class BackJoon_11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for(int i = 0; i < cNum.length; i++){
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}