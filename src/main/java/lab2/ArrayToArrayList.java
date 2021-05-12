package lab2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayToArrayList {
  static Logger log = Logger.getLogger(ArrayToArrayList.class.getName());
	public static void main (String[] args)
    {
		String list[] = new String[5];
		Scanner  sc = new Scanner ( System.in);
		log.info(" Enter the list of Names:");
		for (int i = 0; i < list.length; i++) {
			list[i]= sc.nextLine();
		}
        List<String> al = Arrays.asList(list);
       log.info("=========================");
       log.info("Arraylist");
       log.info("=========================");
       log.info(""+al);
        sc.close();
      }
}
