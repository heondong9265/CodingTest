// TODO : 스택 오큰수 구하기

// 벨로그 정리
// https://velog.io/@beheon/%EC%8A%A4%ED%83%9D2

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BackJoon_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N]; 
        int[] ans = new int[N]; // 정답배열
        String[] str = bf.readLine().split(" ");
        for(int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0); //초기 값은 항상 비어있으므로 0을 push해 초기화
        for(int i = 1; i < N; i++) {
            // 스택이 비어있지 않거나, 현재 스택이 push할 값보다 작을 경우
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                ans[stack.pop()] = A[i]; // 정답 배열에 오큰수 저장
            }
            stack.push(i);
        }
        while(!stack.empty()) {
            ans[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
