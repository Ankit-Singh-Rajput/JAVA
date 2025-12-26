public static int clearIthBit(int n, int i)
{
    int bitMask = ~(1 << i);
    return n & bitMask;
}

// public static int setIthBit(int n, int i)
// {
//     int bitMask = 1<<i;
//     return n | bitMask;
// }

public static int updateIthBit(int n, int i, int newBit)
{
    // if(newBit == 0)
    // {
    //     return clearIthBit(n, i);  // Calling Code from Line 1 to 5
    // }
    // else {
    //     return setIthBit(n, i);   // Calling Code from Line 7 to 11
    // }

    n = clearIthBit(n, i);     // Calling Code from Line 1 to 5
    int bitMask = newBit<<i;
    return n | bitMask;
}

public static void main(String args[])
{
    System.out.println(updateIthBit(10,2,1));
}