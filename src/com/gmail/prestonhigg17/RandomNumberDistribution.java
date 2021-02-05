package com.gmail.prestonhigg17;

import java.util.ArrayList;

public class RandomNumberDistribution
{
    private ArrayList<Integer> randNums = new ArrayList<Integer>();
    RandNum number = new RandNum();

    public void createList()
    {
        for (int index = 0; index < 10; index++)
        {
            randNums.add(index, number.getNextBetween(0, 9));
        }
    }

}
