package com.or;

import java.util.Scanner;

public class Main {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        yesOrNo();
    }

    public static void yesOrNo() {

        System.out.println("Please enter amount of pairs to check: ");
        int p = SCANNER.nextInt();

        boolean[] b = new boolean[p];

        SCANNER.nextLine();
        for (int k = 0; k < p; k++) {

            String s1 = SCANNER.nextLine();
            String s2 = SCANNER.nextLine();
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (c1[i] == c2[j]) {
                        b[k] = true;
                        break;
                    }
                }
            }
        }
        for (int s = 0; s < b.length; s++) {
            if (b[s]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

