package com.gmail.prestonhigg17;

import java.util.ArrayList;

public class DeleteDups
{
    public ArrayList<Integer> removeDups(ArrayList<Integer> arrayRemove)
    {
        for (int index = arrayRemove.size() - 1; index > 0; index--)
        {
            int examine = arrayRemove.get(index);
            for (int j = arrayRemove.size() - 2; j > -1; j--)
            {
                if (examine == arrayRemove.get(j) && index != j)
                {
                    arrayRemove.remove(j);
                }
            }
        }
        return arrayRemove;
    }
}
