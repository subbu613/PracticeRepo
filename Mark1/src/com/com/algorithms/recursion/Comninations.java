package com.com.algorithms.recursion;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Comninations {

    private static List<List<Integer>> combinations(int[] n) {
        List<List<Integer>> results = new LinkedList();
        combinations(n, 0, results, new LinkedList<Integer>());
        return results;
    }

    private static void combinations(int[] n, int i, List<List<Integer>> results, List<Integer> path) {
        if (i == n.length) {
            results.add(path);
            return;
        }
        List<Integer> pathWithCurrent = new LinkedList(path);
        pathWithCurrent.add(n[i]);
       // path.add(n[i]);
// Find all the combinations that exclude the current item
        combinations(n, i + 1, results, path);
        // Find all the combinations that include the current item
        combinations(n, i + 1, results, pathWithCurrent);
    }

    public static void main(String[] args) {

        List<List<Integer>> lists = combinations(new int[]{2, 3, 4});
        for (List<Integer> list : lists) {
            System.out.println("list "+list);
            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("****************************Permutations****************************");
            List<Integer> arrList=new CopyOnWriteArrayList<>();
            arrList.add(2);
            arrList.add(3);
            arrList.add(4);
        List<List<Integer>> permlists = permutation(arrList);
        for (List<Integer> list : permlists) {
            System.out.println("list "+list);
            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


    }
    private static List<List<Integer>> permutation(List<Integer> n) {
        List<List<Integer>> results = new LinkedList();
        permutation(n, results, new LinkedList<Integer>());
        return results;
    }


    private static void permutation(List<Integer> n,List<List<Integer>> result,List<Integer> path)
    {
        if (n.isEmpty()) {
                result.add(path);
            return;
        }
        System.out.println("For "+n);
            for (int i:n)
            {
                System.out.println("at starting of for");
                printList(n);
                System.out.println("           val "+i);
                n.remove((Object)i);

                List<Integer> pathWithCurrent=new LinkedList<>(path);
                pathWithCurrent.add(i);
                permutation(n,result,pathWithCurrent);
                n.add(i);
                printList(n);
            }
        System.out.println("after for");

    }

    private static void printList(List<Integer> n) {

        System.out.println("printing list");
        for (int i:n) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
