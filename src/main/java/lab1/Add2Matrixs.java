package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Add2Matrixs {
	static Logger log = Logger.getLogger(Add2Matrixs.class.getName());

	 public static void main(String args[])
	  {
	    int m;
		int n;
		int c;
		int d;
	    Scanner in = new Scanner(System.in);

	   log.info("Enter the number of rows and columns of matrix");
	    m = in.nextInt();
	    n = in.nextInt();

	    int first[][] = new int[m][n];
	    int second[][] = new int[m][n];
	    int sum[][] = new int[m][n];

	   log.info("Enter the elements of first matrix");

	    for (c = 0; c < m; c++)
	      for (d = 0; d < n; d++)
	        first[c][d] = in.nextInt();

	   log.info("Enter the elements of second matrix");

	    for (c = 0 ; c < m; c++)
	      for (d = 0 ; d < n; d++)
	        second[c][d] = in.nextInt();

	    for (c = 0; c < m; c++)
	      for (d = 0; d < n; d++)
	        sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices

	   log.info("Sum of the matrices:");

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++){
	        log.info(  sum[c][d] + "\t");
		  }
	  
	    }
	  }
}
