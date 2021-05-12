package lab2;

import java.util.Scanner;
import java.util.logging.Logger;

public class MaxArray {
	static Logger log = Logger.getLogger(MaxArray.class.getName());
	public static void main(String[] args)
	{
	int n;
	int max;
	Scanner s = new Scanner(System.in);
	log.info("Enter the number of elements in the array:");
	n = s.nextInt();
	int a[] = new int[n];
	log.info("Enter the elements of array:");
	for(int i = 0; i < n; i++)
	{
	a[i] = s.nextInt();
	}
	max = a[0];
	for(int i = 0; i < n; i++)
	{
	if(max < a[i])
	{
	max = a[i];
	}
	}
	log.info("Maximum value in the array is:"+max);
	s.close();
}

}
