public static void DecToBin(int n)
{
    int num = n; 
    int binNum = 0;
    int power = 0;

    while(n>0) 
    {
        int rem = n % 2;
        binNum = binNum + (rem *(int)Math.pow(10,power));
        n = n/2;
        power++;
    }
    System.out.println("Binary of " + num  + " is : " + binNum);
}

public static void main(String args[])
{
    DecToBin(56);
    DecToBin(219);
}