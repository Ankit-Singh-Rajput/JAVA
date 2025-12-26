public static int clearRangeBit(int n, int i, int j)
{
    int left_mask = (~0) << (j + 1); // Sets all bits from j+1 to the left as 1, rest 0
    int right_mask = (1 << i) - 1;   // Sets all bits from 0 to i-1 as 1, rest 0

    int bitMask = left_mask | right_mask;
    return n & bitMask;
}

public static void main(String args[])
{
    System.out.println(clearRangeBit(10,2,4));
}