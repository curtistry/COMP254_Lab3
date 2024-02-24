package exercise1;

public class ProductDriver {
	
	public static int Product(int m, int n)
	{
		//System.out.printf("m=%d, n=%d\n",m,n);
		//if either m or n is 1, return the other number.
		if (m == 1) {return n;}
		if (n == 1) {return m;}
		
		//if either m or n is 0, return 0.
		if (m == 0 || n == 0) {return 0;}
		
		//call the method again	
		if (n > 0)	//if n is positive,
		{
			//repeat until 'n' reaches 1 (or 0).
			return m + Product(m,n - 1);
		}
		else	//if n is negative,
		{	//repeat until 'n' reaches 0.
			return Product(m,n + 1) - m;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 6;
		int result = Product(m,n);
		System.out.printf("%d * %d = %d\n", m,n,result);
	}

}
