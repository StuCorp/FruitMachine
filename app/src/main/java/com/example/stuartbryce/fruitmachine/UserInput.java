package com.example.stuartbryce.fruitmachine;

import java.util.Scanner;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class UserInput {

    public static int getUserInt() {
        Scanner sc = new Scanner(System.in);
        int answer;
        do {
//            System.out.println("choose! choose! choose!");
            while (!sc.hasNextInt()) {
                System.out.println("number!");
                sc.next();
            }
            answer = sc.nextInt();
        } while (!(answer > 0 && answer < 10));
        return answer;
    }

    public static boolean getBoolean() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Keep going? yes or no");
        if (sc.nextLine().equals("yes")) {
            System.out.println("yes");
            return true;

        } else {
            System.out.println("no");

            return false;
        }
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toLowerCase();
    }
}

