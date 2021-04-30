package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringArrayToArrayList {
	public static void main(String[] args) {

		
		ArrayList<String> friendsnames= new ArrayList<String>();
		friendsnames.add("Ankur");
		friendsnames.add("Ajeet");
		friendsnames.add("Harsh");
		friendsnames.add("John");
		System.out.println("Before Conversion");
        System.out.println(friendsnames);
        System.out.println("===========================");
		/*ArrayList to Array Conversion */
		String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);
		System.out.println("After Conversion");
		/*Displaying Array elements*/
		for(String k: frnames)
		{
			System.out.println(k);
		}
	}
}
