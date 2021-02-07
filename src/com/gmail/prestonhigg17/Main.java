package com.gmail.prestonhigg17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        RandomNumberDistribution randNums = new RandomNumberDistribution();
        InsertSort insertSort = new InsertSort();
        MedianAndMode medianAndMode = new MedianAndMode();
//        System.out.println("Welcome to the Random Number Distributor Program!\nPress enter to begin the program");
//        pressEnterToContinue();
//        System.out.println("Enter the Min value: ");
//        int min = scan.nextInt();
//        System.out.println("Enter the Max value: ");
//        int max = scan.nextInt();
//        randNums.createList(min, max);
//        System.out.println(Arrays.toString(randNums.returnList().toArray(new Integer[0])));
//        pressEnterToContinue();
//        System.out.println("Enter a new Min value: ");
//        min = scan.nextInt();
//        System.out.println("Enter a new Max value: ");
//        max = scan.nextInt();
//        System.out.println("Enter a List Size value: ");
//        int size = scan.nextInt();
//        insertSort.createArray(5, 1, 7);
//        System.out.println(Arrays.toString(insertSort.returnList().toArray(new Integer[0])));
//        pressEnterToContinue();
//        medianAndMode.calcMedian(insertSort.returnList());
        medianAndMode.calcMode(new ArrayList<Integer>(Arrays.asList(1, 3, 5, 5, 7)));
        String modeValue = "";
        if (medianAndMode.returnMode() == -1)
        {
            modeValue = "NO MODE";
        } else
        {
            modeValue = Integer.toString(medianAndMode.returnMode());
        }
        System.out.println("Calculating Median...\n" +
                medianAndMode.returnMedian() +
                "\nCalculating Mode...\n" +
                modeValue);


    }

    private static void pressEnterToContinue()
    {
        System.out.println("\nPress Enter key to continue...");
        try
        {
            System.in.read();
        } catch (Exception e)
        {
        }
    }
}
