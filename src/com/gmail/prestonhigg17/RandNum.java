package com.gmail.prestonhigg17;

public class RandNum
{

    int a = 16807;
    int c = 0;
    int m = 2147483647;
    int x;

    public RandNum()
    {
        x = (int) (System.currentTimeMillis() % 10000);
    }

    public RandNum(int seed)
    {
        x = seed;
    }

    // return 0 <= x < Integer.MAX_VALUE
    public int getNextInt()
    {
        x = (a * x + c) % m;
        return Math.abs(x);
    }

    // return 0 <= result < 1
    public double getNextDouble()
    {
        double result = 0.0;
        return result;
    }

    // return a <= result <= b
    public int getNextBetween(int a, int b)
    {
        int result = (int) ((Math.random() * b) + a);
        return result;
    }

}

