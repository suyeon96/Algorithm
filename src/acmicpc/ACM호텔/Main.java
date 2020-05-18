/**
 * ACM 호텔
 * https://www.acmicpc.net/problem/10250
 * Mem : 15140KB / Time : 132ms
 */

package acmicpc.ACM호텔;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){
        int T = scan.nextInt(); 		// test 개수
        String result[] = new String[T];		// 정답

        for(int i=0; i<T; i++) {
            int H = scan.nextInt();		// 호텔 층수
            int W = scan.nextInt();		// 각 층의 방수 (필요없는데이터긴하지만 받아놓음)
            int N = scan.nextInt();		// 몇 번째 손님

            String floor = null;
            String room = null;

            if(N%H == 0){
                floor = Integer.toString(H);
                room = N/H>9?Integer.toString(N/H):"0"+Integer.toString(N/H);
            }else{
                floor = Integer.toString(N%H);
                room = N/H+1>9?Integer.toString(N/H+1):"0"+Integer.toString(N/H+1);
            }

            result[i] = floor + room;
        }

        for(String hotelNo:result) {
            System.out.println(hotelNo);
        }
    }
}
