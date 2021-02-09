package com.gmail.prestonhigg17;

import java.util.ArrayList;

public class MedianAndMode
{
    private double median = 0;
    private int mode = 0;

    public void calcMedian(ArrayList<Integer> calcMed)
    {
        if (calcMed.size() % 2 == 0)
        {
            double firstMidTerm = calcMed.get(calcMed.size() / 2 - 1);
            double secondMidTerm = calcMed.get(calcMed.size() / 2);
            this.median = (firstMidTerm + secondMidTerm) / 2;
        }

        if (calcMed.size() % 2 == 1)
        {
            this.median = calcMed.get(calcMed.size() / 2);
        }

    }

    public void calcMode(ArrayList<Integer> calcMode)
    {
        System.out.println(calcMode);
        ArrayList<Integer> values = new ArrayList<Integer>();  //the unique values
        ArrayList<Integer> counts = new ArrayList<Integer>();  //corresponding counts

        // Collect counts for each value
        for (int valueIndex = 0; valueIndex < calcMode.size(); ++valueIndex)
        {
            // Only process a value once
            if (!values.contains(calcMode.get(valueIndex)))
            {
                int count = 0;
                for (int searchIndex = 0; searchIndex < calcMode.size(); ++searchIndex)
                {
                    // Count all instances of this value
                    if (calcMode.get(searchIndex) == calcMode.get(valueIndex))
                    {
                        ++count;
                    }
                }

                //Add entry to tracking arrayLists
                values.add(calcMode.get(valueIndex));
                counts.add(count);
            }
        }

        // Determine maxCount from all data
        int maxCount = 0;
        for (int countIndex = 0; countIndex < counts.size(); ++countIndex)
        {
            if (maxCount < counts.get(countIndex))
            {
                maxCount = counts.get(countIndex);
            }
        }

        //Determine the mode
        int firstIndex = counts.indexOf(maxCount); //first value that had this count
        int lastIndex = counts.lastIndexOf(maxCount); //last value that had this count
        if (firstIndex == lastIndex)
        {
            //must be unique instance to be mode (i.e. first and last index containing it has to be the same)
            mode = values.get(firstIndex);
        } else
        {
            mode = -1; // no mode
        }
    }

    public double returnMedian()
    {
        return median;
    }

    public int returnMode()
    {
        return mode;
    }

}
