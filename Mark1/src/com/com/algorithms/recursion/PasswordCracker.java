package com.com.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordCracker {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your password");

        String password = sc.next();

        char[] arr = new char[]{'a', 'b', 'c', 'd', 'e'};
        List<String> combinations = new ArrayList<>();

        //Finding all the combinations of arr
        combinations(arr, 0, combinations, new StringBuffer());

            for (String s : combinations) {
                System.out.println(s );
            }
            System.out.println();
        //Finding all permutations of the above combinations


    }

    private static void combinations(char[] arr, int i, List<String> results, StringBuffer sb) {
        System.out.println("i "+i);
        if (i == arr.length) {
            results.add(sb.toString());
            return;
        }
        StringBuffer sbWithCurrent = new StringBuffer(sb);
        sbWithCurrent.append(arr[i]);
        //without  i
        combinations(arr, i+1, results, sb);

        //with i
        combinations(arr, i+1, results, sbWithCurrent);

    }
}

/*
private static  void permutaions(List<>)
}
*/
