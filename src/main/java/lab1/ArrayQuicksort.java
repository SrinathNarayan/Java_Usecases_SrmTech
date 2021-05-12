package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayQuicksort {
	static Logger log = Logger.getLogger(ArrayQuicksort.class.getName());

	public static int partition(int a[],int l,int h)
	{ 
	int i=l+1 ;
	int j=h;
	int c=l;
	int temp;
	 
	for(; i<=j ;)
	{
	 
	while(i<=h && a[i]<a[c] ) {
	i++; 
	}
	while(a[j]>a[c] && j>l)
	{
	j--;
	}
	if(i<j)
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	else{
	break;
	}
	}
	 
	 
	temp=a[c];
	a[c]=a[j];
	a[j]=temp;
	return j;
	}
	 
	public static void Sort(int a[],int l,int h)
	{ 
	if(l<h)
	{
	int m=partition(a,l,h);
	Sort(a,l,m-1);
	Sort(a,m+1,h);
	 
	} 
	 
	} 
	 
	public static void printarray(int a[])
	{
	for(int i=0; i < a.length; i++)
	{
	 
	log.info(a[i]+" ");
	}
	 
	}
	public static void main(String[] args) 
	{
	int n;
	
	int i;
	Scanner s = new Scanner(System.in);
	log.info("Enter number of elements in the array:");
	n = s.nextInt();
	int [] a= new int[n];
	log.info("Enter "+n+" elements ");
	for( i=0; i < n; i++)
	{
	a[i] = s.nextInt();
	}
	 
	log.info( "elements in array ");
	printarray(a);
	Sort(a,0,n-1);
	log.info( "\nelements after sorting");
	printarray(a);
	s.close();
	}

}
