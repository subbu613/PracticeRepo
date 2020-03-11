package com.ds.lists.arraylist;

public class ArrayListClient {



    public static  void main(String args[])
    {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        System.out.println(list);

        list.insertAt(5,20);
        System.out.println(list);

        list.delete(20);
        System.out.println(list);

        list.delete(30);
        System.out.println(list);

        

    }

}
