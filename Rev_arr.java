import java.util.*;
class Rev_arr
{
	public static void reverseArray(int a[],int start,int end)
	{
		if(a.length==0)
			return;
		if(a.length==1)
		{
			System.out.print(a[0]);
		}
		          if(start>end)
					  return;
					int t=a[start];
					a[start]=a[end];
					a[end]=t;
					reverseArray(a,start+1,end-1);
				}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	reverseArray(a,0,n-1);
	for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
}
}