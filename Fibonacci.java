import java.util.*;
class Fib
{
	public static int fibNum(int n)
	{
		if(n == 1)
		{
			return 0 ;
		}
		else if(n==2)
		{
			return 1;
		}
		else{
			return (fibNum(n-1)+fibNum(n-2));
	}
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    	System.out.print(fibNum(n));
	}
}