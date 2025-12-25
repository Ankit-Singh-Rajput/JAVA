public static void OddOrEven(int n)
{
    int bitMask = 1;
    if ((n & bitMask) == 0)
    {
        System.out.println("Even Nummber");
    }
    else 
    {
        System.out.println("Odd Nummber");
    }
}

public static void main(String args[])
{
    OddOrEven(3);
    OddOrEven(11);
    OddOrEven(14);
}