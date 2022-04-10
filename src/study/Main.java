package study;

import java.util.Scanner;

public class Main {
    // 45분 일찍 알람 설정하기

    // 입력 : 두 정수 H와 M (0<=H<=23 / 0<=M<=59) -> 원래 알람 시간 (0:0 ~ 23:59)
    /* 10 10
     * 0  30 */

    // 출력 : 입력받은 시간에서 45분 앞당긴 시간 출력
    /* 9  25
     * 23 45 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt(); //추가

        if(m < 45) { // 입력한 분이 45분이 되지 않을 때  ex)10:10
            h -= 1; // 먼저 시에서 -1 해주어야 함
            m = 60 - (45 - m); // 45분에서 입력한 분(m)을 뺀 후 60분에서 그 값을 뺌  ex)60-(45-10) -> 60-35=25
            if(h < 0) // 입력한 시가 0시일 경우
                h = 23; // -1시가 되지 않도록 23으로 지정
        } else { // 입력한 분이 45분 이상일 경우 그대로 -45분 해줌
            m -= 45;
        }
        System.out.print(h + " " + m);
    }
}
