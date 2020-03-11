package com.strings.s1containss2;

public class s1containss2 {

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "cde";

//       / System.out.println(contains(s1, s2));
        System.out.println(  containsDevideAndConcur(0,s1.toCharArray(),s2.toCharArray()));

    }

    private static boolean containsDevideAndConcur(int i,char[] a,char[] b)
    {
        System.out.println("i val is "+i);
            if(i==a.length)
                return false;
           else if(compare(i,a,b))
            {
                return true;
            }
        return containsDevideAndConcur(++i,a,b);

    }

    private static boolean compare(int i, char[] a, char[] b) {

        boolean flag=false;
        for (int j=0,k=i;j<b.length && k<a.length;j++,k++)
        {
            if (b[j]==a[k]) {
                    flag = true;
                }
                else
                {
                    return false;
                }

        }
        return flag;
    }


    private static boolean contains(String s1, String s2) {

        boolean flag = false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();


        for (int i = 0; i < a.length; i++) {
            //if(!flag)
            int j;
            for (int k = i; k < b.length; k++) {
                for (j=0; j < b.length; j++) {
                    if (a[k] == b[j]) {
                        flag = true;

                    } else {
                        flag = false;

                    }
                    System.out.println("after loop j "+j+"  k "+k+" i " + i + " " + flag);
                    break;
                }
            }
            if(flag)
                break;
        }
        return flag;
    }

}
