public static boolean isPrime(int n) {
    for(int i=2; i<=n-1; i++) {
        if(n % i == 0) { //completely dividing
            return false;
        }
    }
    return true;
}

public static void main(String args[]) {
    System.out.println(isPrime(5));        // change value to check
    System.out.println(isPrime(8));
}