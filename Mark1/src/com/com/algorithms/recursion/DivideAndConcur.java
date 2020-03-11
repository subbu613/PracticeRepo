package com.com.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class DivideAndConcur {


    public static void main(String [] args)
    {

        List<String> list=paranthasis("abcd");
        for (String s:list)
        {
            System.out.println(s+" ");
        }
    }

    private static List<String> paranthasis(String s)
    {

        List<String> result=new ArrayList<>();
       return paranthasissssss(s);

    }
    private static List<String> paranthasissssss(String s)
    {
        if(s.length()==1)
        {
            List<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }

        List<String> result=new ArrayList<>();
        for(int i=1;i<s.length();i++)
        {
            List<String> left=paranthasissssss(s.substring(0,i));
            List<String> right=paranthasissssss(s.substring(i,s.length()));
            for (String j:left) {
                for (String k:right) {
                    result.add("("+j+k+")");
                    System.out.println("result "+result);
                }
            }
        }
        return result;
    }
}
