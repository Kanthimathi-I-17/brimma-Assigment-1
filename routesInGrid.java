/*15. Starting in the top left corner of a 2×2 grid, and only being able to move to the right
and down, there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?
Ans: 137846528820
*/


public class Main
{
	public static long binomialCoefficient(int n, int k)
	{
		
 
		if (k > (n-k))
			k = n - k;
 
		long c = 1;
 
		for (int i = 0; i < k; i++)
		{
			c = c * (n-i);
			c = c / (i+1);			
		}
 
		return c;
	}
 
	public static void main (String[] args)
	{
		long begin = System.currentTimeMillis();
 
		System.out.println(binomialCoefficient(40,20));
 
		long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");		
	}
}
