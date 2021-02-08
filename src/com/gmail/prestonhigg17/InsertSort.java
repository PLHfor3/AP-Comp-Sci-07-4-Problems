package com.gmail.prestonhigg17;

import java.util.ArrayList;

public class InsertSort
{
    private ArrayList<Integer> sortArray = new ArrayList<Integer>();
    RandNum number = new RandNum();

    public void createArray(int size, int min, int max)
    {
        for (int random = 0; random < size; random++)
        {
            int randomNumber = number.getNextBetween(min, max);
            if (sortArray.isEmpty())
            {
                sortArray.add(randomNumber);
            } else
            {
                if (randomNumber >= sortArray.get(sortArray.size() - 1))
                {
                    sortArray.add(randomNumber);
                } else if (randomNumber <= sortArray.get(0))
                {
                    sortArray.add(0, randomNumber);
                } else
                {
                    for (int index = 1; index < sortArray.size(); index++)
                    {
                        if (sortArray.get(index - 1) <= randomNumber && randomNumber <= sortArray.get(index))
                        {
                            sortArray.add(index, randomNumber);
                            break;
                        }
                    }
                }
            }
        }
    }

    public ArrayList<Integer> returnList()
    {
        return sortArray;
    }

    public void clearArray()
    {
        sortArray.clear();
    }
}
