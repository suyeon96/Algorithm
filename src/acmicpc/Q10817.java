/**
 * 세 수
 * https://www.acmicpc.net/problem/10817
 * Mem : 14260KB / Time : 104ms
 */

package acmicpc;

import java.util.Scanner;

public class Q10817 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int arr[] = {A, B, C};

        for(int i=0; i<3; i++) {
            for(int j=i+1; j<3; j++) {
                if(arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println(arr[1]);
    }
}
