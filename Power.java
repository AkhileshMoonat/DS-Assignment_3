import java.util.*;
class Power
{
	public static int cal(int x,int y)
	{
		if(y==0)
			return 0;
		else if(y==1)
			return x;
		else
			return x*cal(x,y-1);
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int x,y;
		x=s.nextInt();
		y=s.nextInt();
		System.out.print(cal(x,y));
	}
}
