package lab2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Intreverse {
	static Logger log = Logger.getLogger(Intreverse.class.getName());

	public static void main(String[] args) {
		int numbers[] = new int[5];
		Scanner sc = new Scanner(System.in);
		log.info(" Enter the list of numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		log.info("Array before reverse:");

		for (int i = 0; i < numbers.length; i++) {
			log.info(numbers[i] + " ");
		}
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
		log.info("\nArray after reverse:");
		for (int i = 0; i < numbers.length; i++) {
			log.info(numbers[i] + " ");
		}
		sc.close();
	}
}
