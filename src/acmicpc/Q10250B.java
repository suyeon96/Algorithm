/**
 * ACM 호텔 (다중 array 사용)
 * https://www.acmicpc.net/problem/10250
 * Mem : 85436KB / Time : 368ms
 */

package acmicpc;

import java.util.Scanner;

public class Q10250B {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){
        int T = scan.nextInt(); 		// test 개수
        int input[][] = new int[3][T];	// input 데이터 (H, W, N)

        for(int i=0; i<T; i++) {
            input[0][i]	= scan.nextInt();		// H 호텔 층수
            input[1][i]	= scan.nextInt();		// W 각 층의 방수
            input[2][i]	= scan.nextInt();		// N 몇 번째 손님
        }

        // 테스트케이스만큼 Loop
        for(int i=0; i<T; i++) {
            int w = input[1][i];
            int h = input[0][i];
            String hotel[][] = new String[w][h];	// W * H 크기의 2차원 배열로 호텔 방 구현
            int n = input[2][i];

            // 호텔방 배열에 String형으로 방번호 기입
            for(int j=0; j<h; j++) {
                for(int k=0; k<w; k++) {
                    if(k<9) {
                        hotel[k][j] = Integer.toString(j+1) + "0" + Integer.toString(k+1);
                    }else {
                        hotel[k][j] = Integer.toString(j+1) + Integer.toString(k+1);
                    }
                }
            }

            // 손님 순서를 count하며 순차적으로 방 배정 (count가 0이 되었을때 해당 방 배정) - 질문의 의도와 동일하게 구현
            loop:
            for(int j=0; j<w; j++) {
                for(int k=0; k<h; k++) {
                    n--;
                    if(n==0) {
                        System.out.println(hotel[j][k]);
                        break loop;
                    }
                }
            }
        }
    }
}
