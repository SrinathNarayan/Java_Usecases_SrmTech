package lab2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToArrayList {
	public static void main (String[] args)
    {
		String list[] = new String[5];
		Scanner  sc = new Scanner ( System.in);
		System.out.println(" Enter the list of Names:");
		for (int i = 0; i < list.length; i++) {
			list[i]= sc.nextLine();
		}
        List al = Arrays.asList(list);
        System.out.println("=========================");
        System.out.println("Arraylist");
        System.out.println("=========================");
        System.out.println(al);
    }
}
