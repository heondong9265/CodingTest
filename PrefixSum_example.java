// 벨로그 정리
// https://velog.io/@beheon/%EA%B5%AC%EA%B0%84-%ED%95%A9

public class PrefixSum_example {
    public static void main(String[] args){
        int[] A =  {7, 2, 9 ,5, 4, 1}; //배열 A
        int[] S = new int[A.length]; //합 배열 S

        S[0] = A[0]; //첫 번째 요소는 그대로 복사

        // 합 배열 S를 만드는 공식 적용 → S[i] = S[i-1] + A[i]
        for(int i = 1; i<A.length; i++){
            S[i] = S[i-1] + A[i];
        }

        // 합 배열 S 출력
        for (int i = 0; i < S.length; i++) {
            System.out.println("S[" + i + "] = " + S[i]);
        }

        // 구간 합 구하는 공식 적용 → S[5] - S[2-1]
        System.out.println(S[5] - S[2-1]);
    }
}