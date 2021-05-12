package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class String_Palindrome {
	static Logger log = Logger.getLogger(String_Palindrome.class.getName());

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		log.info("Enter a string: ");

		String str = scn.nextLine();

		String revStr = "";

		int i;

		int strLen = str.length();

		i = strLen - 1;

		while (i >= 0) {

			revStr = revStr + str.charAt(i);

			i--;
		}

		if (str.equals(revStr)) {

			log.info(str + " IS A PALINDROME STRING");
		} else {

			log.info(str + " IS A NOT PALINDROME STRING");
		}scn.close();
	}
}
