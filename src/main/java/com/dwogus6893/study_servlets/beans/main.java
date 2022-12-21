package com.dwogus6893.study_servlets.beans;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //N의 정수
        int [] array = new int[N]; //N의 정수를 담을 주머니?
        int cnt = 0; //합계는 0으로 시작

        for(int i=0; i<N; i++){
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for(int i=0; i<array.length; i++){
            if(v == array[i]){
                cnt ++;
            }
        }
        System.out.println(cnt);        

        
    }
}
