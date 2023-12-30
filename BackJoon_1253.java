// TODO : 투 포인터 응용 3 - 좋은 수 구하기

// 벨로그 정리
// https://velog.io/@beheon/%ED%88%AC-%ED%8F%AC%EC%9D%B8%ED%84%B03

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon_1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;
        for (int i = 0; i < N; i++) {
            int find = A[i];
            int start_index = 0;
            int end_index = N-1;

            while (start_index < end_index) {
                if (A[start_index] + A[end_index] < A[i]) {
                    start_index++;
                }
                else if (A[start_index] + A[end_index] > A[i]) {
                    end_index--;
                }
                else if (A[start_index] + A[end_index] == find) {
                    // 자기 자신을 포함하면 안되므로 체크 한번
                    if (start_index != i && end_index != i) {
                        count++;
                        break;
                    }
                    else if (start_index == i) {
                        start_index++;
                    }
                    else if (end_index == i) {
                        end_index--;
                    }
                }
            }
        }
        System.out.println(count);
        bf.close();
    }
}