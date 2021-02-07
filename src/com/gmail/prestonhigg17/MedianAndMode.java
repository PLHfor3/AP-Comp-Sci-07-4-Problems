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
        int workingVar = calcMode.get(0);
        int mostOccuredValue = workingVar;
        int workingVarCounter = 1;
        int mostOccuredCounter = 0;
        for (int index = 1; index < calcMode.size() - 1; index++)
        {
            if (workingVar == calcMode.get(index))
            {
                workingVarCounter++;
            } else
            {
                if (workingVarCounter > mostOccuredCounter)
                {
                    mostOccuredCounter = workingVarCounter;
                    mostOccuredValue = workingVar;

                } else if (workingVarCounter == mostOccuredCounter && workingVarCounter > 1)
                {
                    mode = -1;
                    return;
                } else
                {
                    workingVar = calcMode.get(index);
                    workingVarCounter = 1;
                }

            }
        }
        mode = mostOccuredValue;
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
