package com.gmail.prestonhigg17;

import java.util.ArrayList;

public class RandomNumberDistribution
{
    private ArrayList<Integer> randNums = new ArrayList<Integer>();
    RandNum number = new RandNum();

    public void createList(int min, int max)
    {
        for (int index = min; index < max; index++)
        {
            randNums.add(number.getNextBetween(min, max));
        }
    }

    public ArrayList<Integer> returnList()
    {
        return randNums;
    }

}
