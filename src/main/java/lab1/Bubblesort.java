package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Bubblesort {
	static Logger log = Logger.getLogger(Bubblesort.class.getName());

	public static void Sort(int a[])
	{ 
	int n=a.length;
	int i;
	int j;
	
	int temp;
	for (i = 0;i < n-1; i++) 
	{ 
	for (j=0; j<n-i-1; j++)
	{ 
	if(a[j+1]<a[j])
	{temp=a[j+1];
	a[j+1]=a[j];
	a[j]=temp;} 
	} 	 
	} 
	}
	public static void printarray(int a[])
	{
	for(int i=0; i < a.length; i++)
	{
	 
	log.info(" "+a[i]);
	}	 
	}
	public static void main(String[] args) 
	{
	int n;
	int i;
	Scanner s = new Scanner(System.in);
	log.info("Enter number of elements in the array:");
	n = s.nextInt();
	int[] a = new int[n];
	log.info("Enter "+n+" elements ");
	for( i=0; i < n; i++)
	{
	a[i] = s.nextInt();
	}
	 
	log.info( "elements in array ");
	printarray(a);
	Sort(a);
	log.info( "\nelements after sorting");
	printarray(a);
	s.close();
	}

}
