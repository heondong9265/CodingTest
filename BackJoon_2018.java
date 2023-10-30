// TODO : 투 포인터 응용 1 - 연속된 자연수의 합 구하기

// 벨로그 정리
// https://velog.io/@beheon/%ED%88%AC-%ED%8F%AC%EC%9D%B8%ED%84%B0

import java.util.Scanner;

public class BackJoon_2018 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start_index = 1;
        int end_index = 1;
        int count = 1;
        int sum = 1;
        
        while(end_index != N) {
            if(sum == N) {
                end_index++;
                sum += end_index;
                count++;
            }
            else if(sum > N) {
                sum -= start_index;
                start_index++;
            }
            else if(sum < N) {
                end_index++;
                sum += end_index;
            } 
        }

        System.out.println(count);
    }
}