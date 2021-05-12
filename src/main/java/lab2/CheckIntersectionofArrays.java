package lab2;

import java.util.logging.Logger;

public class CheckIntersectionofArrays {
	static Logger log = Logger.getLogger(CheckIntersectionofArrays.class.getName());
	public static void main(String args[]) {
	      int myArray1[] = {23, 36, 96, 78, 55};
	      int myArray2[] = {78, 45, 19, 73, 55};
	     log.info("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	              log.info(""+myArray2[j]);
	            }
	         }
	      }
	   }
}