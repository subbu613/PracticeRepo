package com.greedy;

public class CoinChangeGreedyWay {


    public static void main(String args[])
    {
        int [] coins={10,6,1};
        printArray(coins);
        int sum=28;
        int [] result=makeChange(coins,sum);
        printArray(result);

    }
    static int[] makeChange(int[] coins,int sum){

        int result[] =new int[coins.length];
            int total=0;
        for (int i=0 ;i<coins.length;i++)
        {
            while (total!=sum)
            {
                int local=total+coins[i];
                if(local>sum)
                    break;
                else
                {
                    total=local;
                    result[i]=result[i]+1;
                }
            }
        }
        return result;
    }

    static void printArray(int [] result)
    {
        for (int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
