public static int sum(int a, int b) {
    return a+b;
}

public static float sum(float a, float b) {
    return a+b;
}

public static int sum(int a, int b, int c) {
    return a+b+c;
}

public static void main(String args[]) {
    System.out.println(sum(6,4));
    System.out.println(sum(4.5f,4.3f));
    System.out.println(sum(4,7,4)); 
}