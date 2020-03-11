package com.com.algorithms.recursion;

public class Permutations {
static int  count=0;
    public static void main(String[] args)
    {

        int[] arr={1,2,3,4};

printAllRecursive(arr.length,arr);
        System.out.println("Total "+count);
    }

   /* Heap’s Algorithm
   ================================================
    Finally we come to my favorite algorithm. It is small, efficient, and elegant and brilliantly simple in concept. We use the first and simplest concept we came up with “Basic Permutation 1: Remove” i.e. remove each element in turn and recursively generate the remaining permutations.

    The problem we faced in a naive implementation was we had to do two swaps in order to pick the next element to remove.

    Now consider this – what if we had some clever way to keep track of which elements we had already removed? Then we could just swap out unremoved elements and never need to do the second swap to restore order!

    This is basically what Heap found – a method for picking the element to swap so that it is different in each case. The way it works is:

    If the number of elements is odd, always pick the first one
    If the number of elements is even, pick them up sequentially
    Sadly I have never been able to develop a complete intuition for why this works so I just memorize it.

    Because it is hard to develop an intuition for Heap’s Algorithm there are several incorrect implementations floating around the net. In fact, the Wikipedia page for Heap’s algorithm had a bug until 2015, and had to be fixed again twice in 2016 because it was edited incorrectly. This is the correct version:
   */


    public static  void printAllRecursive(
            int n, int[] elements) {


        if (n == 1) {
            printArray(elements);
            count++;

        } else {
            for (int i = 0; i < n-1; i++) {
                System.out.println("n is "+n +" i "+i);
                /*for (int j=0;j<n;j++) {
                    System.out.print("*");
                }*/
                printAllRecursive(n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            printAllRecursive(n - 1, elements);
        }

    }

    private static void swap(int [] input, int a, int b) {
        System.out.println( "swaping "+input[a]+" with "+input[b]);
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    private static void printArray(int[] input) {
        System.out.print('\n');
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }

}
