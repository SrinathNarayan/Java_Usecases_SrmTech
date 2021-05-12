package lab1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class DuplicateArray {
	static Logger log = Logger.getLogger(DuplicateArray.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     log.info("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	     log.info("Enter the elements of the array ::");
	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.nextInt();
	      }

	        int[] uniqueArr = new int[myArray.length];
	        int counter = 0;
	        Arrays.sort(myArray);
	        for (int i = 0; i < myArray.length - 1; i++) {
	            if (myArray[i] != myArray[i + 1]) {
	                uniqueArr[counter] = myArray[i];
	                counter++;
	            }
	        }
	        uniqueArr[counter] = myArray[myArray.length - 1];
	       log.info("Array with Unique Elements : ");
	        for (int i = 0; i <= counter; i++) {
	           log.info(uniqueArr[i]+ " ");
	        }
			sc.close();
	    }

	}



