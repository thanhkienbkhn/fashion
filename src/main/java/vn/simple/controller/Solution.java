package vn.simple.controller;

import java.util.Scanner;

public class Solution {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int games = sc.nextInt();
        int[] scores = new int[games];

        for (int i = 0; i < games; i++) {
            scores[i] = sc.nextInt();
        }
        count(scores);
    }

    private static void count(int[] scores){
        int min = 0, max = 0, countMin = 0, countMax = 0;
        boolean flag = false;

        for (int score: scores){
            if (!flag){
                min = score;
                max = score;
                flag = true;
            }
            if (score < min){
                ++countMin;
                min = score;
            } else if (score > max){
                ++countMax;
                max = score;
            }
        }
        System.out.println(countMax + " " + countMin);
    }
}
