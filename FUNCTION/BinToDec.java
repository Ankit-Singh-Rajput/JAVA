public static void BinToDec(int binNum) 
{
    int num = binNum;
    int decNum = 0;
    int power = 0; // Represents the power of 2 (2^0, 2^1, 2^2, ...)
    while (binNum > 0) 
    {
        // Get the rightmost digit (least significant bit)
        int lastdigit = binNum % 10;

        // Add the digit multiplied by its corresponding power of 2
        decNum = decNum + (lastdigit * (int)Math.pow(2, power));

        // Remove the rightmost digit from the binary number
        binNum = binNum / 10;

        // Increment the power for the next digit
        power++;
    }
    System.out.println("Decimal of " + num + " is : " + decNum); 
}

public static void main(String[] args) 
{
    BinToDec(11011011);
    BinToDec(10101);
}