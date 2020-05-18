/**
 * 손익 분기점
 * https://www.acmicpc.net/problem/1712
 * Mem : 14252KB / Time : 108ms
 */

package acmicpc.손익분기점;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){
        int A = scan.nextInt();		// 고정비용
        int B = scan.nextInt();		// 노트북1대 가변비용
        int C = scan.nextInt();		// 노트북 가격

        if(B<C) {
            System.out.println(A / (C - B) + 1);
        }else{
            System.out.println(-1);
        }

    }
}
