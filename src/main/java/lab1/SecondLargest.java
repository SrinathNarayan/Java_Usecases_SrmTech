package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class SecondLargest {
	static Logger log = Logger.getLogger(SecondLargest.class.getName());
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner  sc = new Scanner ( System.in);
		log.info(" Enter the list of numbers:");
		int largest = arr[0]; 
		int secondLargest = arr[0];
	
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		log.info("\nSecond largest number is:" + secondLargest);
		sc.close();

	}


}
