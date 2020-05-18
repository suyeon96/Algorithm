/**
 * 단어 공부
 * https://www.acmicpc.net/problem/1157
 * Mem : 29624KB / Time : 332ms
 */

package acmicpc.단어공부;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){
        String word = scan.next();
        word = word.toUpperCase();
        int arr[] = new int[26];	// 0 initialize
        int topIndex = 0;
        boolean flag = false;

        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            int ascii = (int)ch;

            arr[ascii-65] ++;
        }

        for(int i=1; i<26; i++) {

            if(arr[i] > arr[topIndex]) {
                topIndex = i;
                flag = false;
            }else if(arr[i] == arr[topIndex]) {
                flag = true;
            }
        }

        if(flag) {
            System.out.println("?");
        }else {
            System.out.println((char)(topIndex+65));
        }
    }
}
