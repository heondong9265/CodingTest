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
        int[][] S = new int[N+1][N+1];

        // 2차원 배열 생성
        for(int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 1; j <= N; j++) {
                S[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for(int i = 1; i <= quizNo; i++){
            
        }
    }
}
