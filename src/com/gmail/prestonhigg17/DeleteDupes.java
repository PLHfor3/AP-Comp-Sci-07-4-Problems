package com.gmail.prestonhigg17;

import java.util.ArrayList;

public class DeleteDupes
{
    public ArrayList<Integer> removeDups(ArrayList<Integer> arrayRemove)
    {
        int index = arrayRemove.size() - 1;
        while (index > 0)
        {
            int numberDeleted = 0;
            int examine = arrayRemove.get(index);
            for (int j = index - 1; j > -1; j--)
            {
                if (examine == arrayRemove.get(j) && index != j)
                {
                    arrayRemove.remove(j);
                    numberDeleted++;
                }
            }
            if (numberDeleted > 0)
            {
                index -= numberDeleted;
            } else
            {
                index -= 1;
            }

        }
        return arrayRemove;
    }
}
