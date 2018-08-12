/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arre
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a[]=new int[100000];
	int b[]=new int[100000];
	int n,i;
	Scanner ss=new Scanner(System.in);
	n=ss.nextInt();
	int c=0,n1=0;
	for(i=0;i<n;i++)
	a[i]=ss.nextInt();
	for(i=0;i<n;i++)
	{
		for(int i1=i+1;i1<n;i1++)
		{
			if(a[i]==a[i+1])
			{
				n1++;
				b[c]=a[i];
				c++;
			break;
			}
		}
	}
	if(c==0)
	System.out.println("Unique");
	else
	{
	for(c=0;c<n1;c++)
	{
		if(b[c]>b[c+1])
		b[c]=b[c+1];
		}
		for(c=0;c<n1;c++)
		System.out.println(b[c]);
	}
}
}
