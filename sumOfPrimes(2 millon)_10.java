/*10. The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
Ans: 142913828922*/

import java.math.BigInteger;
public class Main
{
    public static void main(String[] args) 
    {
    
        BigInteger sum = new BigInteger("2");
        boolean isPrime = true;
        for (int i=3; i<2000000; i++) 
        {
        double aa = Math.sqrt((double)i);
            for (int j=2; j<=aa; j++)
            {
                if (i % j == 0)
                { 
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                sum = sum.add(BigInteger.valueOf(i));
            }
            isPrime = true;
        }
        System.out.println("Sum  = "+sum); 
    }
}
