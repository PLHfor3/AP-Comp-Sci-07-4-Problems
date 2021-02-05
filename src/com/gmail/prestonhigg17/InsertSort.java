package com.gmail.prestonhigg17;

import java.util.ArrayList;

public class InsertSort
{
    private ArrayList<Integer> sortArray = new ArrayList<Integer>();
    RandNum number = new RandNum();

    public void createArray(int size)
    {
        for (int index = 0; index < size; index++) ;
        {
            sortArray.add(index, number.getNextBetween(1, 10));
        }
        System.out.println(sortArray);
    }

    public void insertSort()
    {

    }
}
