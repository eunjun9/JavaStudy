package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    // 1.5초 이내 A+B 연산

    // 입력 : 테스트케이스 개수 T (최대 100만), T개의 두 정수 A와 B (1이상 1000이하)
	/* 5 (테스트케이스)
	   1 1
       12 34
       5 500
       40 60
       1000 1000 */

    // 출력 : A+B를 한 줄에 하나씩 순서대로 출력
	/* 2
       46
       505
       100
       2000 */
    public static void main(String[] args) throws IOException, IOException {
        // Scanner는 '문자'형태로 정규식 검사 -> 정규식 검사 코드가 길어서 시간이 오래 걸림 (시간 초과)
        // BufferedReader는 '문자열'그대로 읽음 -> 정규식 검사 X, 시간 단축
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 방법 1
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트케이스 개수 입력 (문자열로 받으므로 정수로 파싱)

        StringTokenizer st; // A와 B 입력받을 st

        // 출력 방법 2 (이 방법이 좀 더 빠르나 데이터 양이 더 커지게 된다면 BufferedWriter가 더 빠름)
//		StringBuilder sb = new StringBuilder();

        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine()); // A와 B 입력 후 토큰 분리(구획문자 입력X -> 기본값 공백)
            // 분리된 A와 B를 정수로 변환 후 더함 + 개행
            bw.write((Integer.parseInt(st.nextToken())) + (Integer.parseInt(st.nextToken())) + "\n");
//			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        br.close();

//		System.out.println(sb);
        bw.flush(); // 버퍼 비우기 (쌓인 값 한번에 출력)
        bw.close();
    }
}
