package recursion;

public class TaylorSeries {
	
	/*
	 *  e^x = 1+ x + (x^2/2!) + (x^3/3!)+ ….. n terms
	 */
	public static double e(int x, int n)
	{
		double sum = 1; 
		double p	= 1;
		double f	= 1;
		for(int i=1; i<=n; i++)
		{
			p *=x;
			f *=i;
			sum += (p/f); 
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(e(3,10));
		System.out.println(hornerE(3, 10));
	}
	
	//Horner's rule minimizes the multiplications in taylor's series
	/*
	 * e^x = 1 + (x/1) [1 + (x/2) [1 + (x/3) [ 1 + (x/4)]]]
	 */
	
	public static double hornerE(int x, int n)
	{
		double sum = 1;
		for(;n>0; n--) {
			sum = 1+ x*sum/n;
		}
		return sum;
	}

}
