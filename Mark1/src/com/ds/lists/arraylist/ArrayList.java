package com.ds.lists.arraylist;

public class ArrayList {

    int size;
    int nElemes;
    int [] arr;
    public ArrayList()
    {
        size=16;
        arr=new int[size];
        nElemes=0;
    }

    public void add(int val)
    {
        if(isFull())
        {
            refactor();
        }

        arr[nElemes++]=val;
    }

    public void delete(int val)
    {
        int j=valueIsAt(val);
        if(j==-1)
            return;

        for (;j<nElemes-1;j++)
        {
            arr[j]=arr[j+1];
        }
        nElemes--;
    }

    void insertAt(int position,int val)
    {
        if(isFull())
            refactor();
        for (int i=nElemes;i>position;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[position]=val;
        nElemes++;
    }
    boolean isFull()
    {
        return nElemes==size-1;
    }
    int[] refactor()
    {
        size=size*2;
        int [] arr2=new int[size];
        for (int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i];
        }
        return arr=arr2;
    }

    int valueIsAt(int val)
    {
        for (int i=0;i<nElemes;i++)
        {
            if(arr[i]==val)
                 return i;
        }
        return -1;
    }
    @Override
    public String toString()
    {
        for (int i=0;i<nElemes;i++
             ) {
            System.out.print(arr[i]+" ");
        }
            return null;
    }

    public int getSize()
    {
        return nElemes-1;
    }
}
