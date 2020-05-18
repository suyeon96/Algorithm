/**
 * 평균은 넘겠지
 * https://www.acmicpc.net/problem/4344
 * Mem : 16836KB / Time : 180ms
 */

package acmicpc.평균은넘겠지;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){
        int C = scan.nextInt();		// 테스트케이스 개수
        String dump[] = new String[C];
        scan.nextLine();

        for(int i=0; i<C; i++) {
            dump[i] = scan.nextLine();
        }

        for(int i=0; i<C; i++) {
            String arr[] = dump[i].split(" ");

            int N = Integer.parseInt(arr[0]);
            int arrInt[] = new int[N];
            int sum = 0;

            for(int j=0; j<N; j++) {
                arrInt[j] = Integer.parseInt(arr[j+1]);
                sum += arrInt[j];
            }

            float avg = sum/(float)N;
            int cnt=0;

            for(int k=0; k<N; k++) {
                if(arrInt[k] > avg) {
                    cnt++;
                }
            }

            System.out.println(String.format("%.3f", cnt/(float)N * 100)+"%");
        }
    }
}
