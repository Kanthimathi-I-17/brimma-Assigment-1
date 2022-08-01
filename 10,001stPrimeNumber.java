/*7. By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th
prime is 13.
What is the 10,001st prime number?
Ans: 104743*/

public class Main {
    public static void main(String args []){
        long numberOfPrimes = 0;
        int number = 1;
        int maxLimit = 10000000;
        boolean[] sieve = new boolean[maxLimit];
        for ( int i = 2; i < maxLimit; i++ ) {
            if ( sieve[i] == true ) continue;

            numberOfPrimes++;

            if ( numberOfPrimes == 10001 ) {
                number = i;
                break;
            }

            for ( int j = i+i; j < maxLimit; j += i )
                sieve[j] = true;
        }
        System.out.println("10001st prime: "+ number);
    }
}
