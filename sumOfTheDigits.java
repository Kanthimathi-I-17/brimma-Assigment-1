/*20. n! means n × (n − 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is
3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!
Ans: 648
*/
public class Main
{
  public static void main (String[]args)
  {
      int i,fac=1,rem,sum=0;
      for(i=10;i>=1;i--)
      {
          fac*=i;
      }
      System.out.println(fac);
      while(fac>0)
      {
          rem=fac%10;
          sum+=rem;
          fac/=10;
      }
      System.out.print(sum);
  }
}
