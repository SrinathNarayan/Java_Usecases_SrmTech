package GenericsFruitShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public class Options   {
	static Logger log = Logger.getLogger(Options.class.getName());
	public static final String S1 = "Jk Trader";
	public static final String S2 = "Gmart";
	public static final String S3 = "Grace";
	public static final String S4 = "Bigbash";
	public static final String S5 = "Cit";
	public static final String T1 = "Exotic";
	public static final String T2 = "Organic";
	public static final String T3 = "Fresh";
	public static final String F1 = "Mango";
	public static final String F2 = "Kiwi";
	public static final String F3= "Orange";
	public static final String F4 = "Banana";
	public static final String F5 = "Grapes";
	public static final String F6 = "Apples";
	public static final String F7 = "WaterMelons";
	public static final String F8 = "Blueberriess";
	public static final String F9 = "Avocados";
	public static final String F10 = "Cherries";
	public static final String F11 = "Apricot";
	public static final String F12 = "BlackBerries";


 void compeletelist(){
		   int j;
		   int n;
		   Scanner sc = new Scanner(System.in);
		  log.info("Enter the the number of records");
		  	n=sc.nextInt();
		  
		ArrayList<FruitsInfo> ar = new ArrayList<>();
        ar.add(new FruitsInfo(F1,S1,230,T1));
        ar.add(new FruitsInfo(F12,S2,330,T3));
        ar.add(new FruitsInfo(F2,S3,250,T2));
        ar.add(new FruitsInfo(F3,S4,600,T1));
        ar.add(new FruitsInfo(F4,S5,900,T2));
        ar.add(new FruitsInfo(F5,S2,600,T3));
        ar.add(new FruitsInfo(F6,S1,200,T2));
        ar.add(new FruitsInfo(F7,S2,500,T2));
        ar.add(new FruitsInfo(F8,S1,300,T3));
        ar.add(new FruitsInfo(F9,S3,700,T1));
        ar.add(new FruitsInfo(F10,S2,650,T2));
        ar.add(new FruitsInfo(F11,S4,800,T1));
    	log.info("Product Details");
		sc.close();
    	  for ( j=0; j<n; j++){
             log.fine(""+ar.get(j));
		  }
		 
    	 }
	
	public void ratelist() {
		int i;
			List<FruitsInfo> ar = new ArrayList<>();
			ar.add(new FruitsInfo(F1,S1,230,T1));
        ar.add(new FruitsInfo(F12,S2,330,T3));
        ar.add(new FruitsInfo(F2,S3,250,T2));
        ar.add(new FruitsInfo(F3,S4,600,T1));
        ar.add(new FruitsInfo(F4,S5,900,T2));
        ar.add(new FruitsInfo(F5,S2,600,T3));
        ar.add(new FruitsInfo(F6,S1,200,T2));
        ar.add(new FruitsInfo(F7,S2,500,T2));
        ar.add(new FruitsInfo(F8,S1,300,T3));
        ar.add(new FruitsInfo(F9,S3,700,T1));
        ar.add(new FruitsInfo(F10,S2,650,T2));
        ar.add(new FruitsInfo(F11,S4,800,T1));
	      Collections.sort(ar,new Sortbycost());
	     log.info("\nView By Price List");
          for(i=0; i<ar.size(); i++){
			log.fine(""+ar.get(i));

		  }
		  
	}
	
	
	public void search() { 
		search s = new search();
		s.fruitsearch();
		
	}
	
	public void sort() {
		List<FruitsInfo> ar = new ArrayList<>();
		ar.add(new FruitsInfo(F1,S1,230,T1));
        ar.add(new FruitsInfo(F12,S2,330,T3));
        ar.add(new FruitsInfo(F2,S3,250,T2));
        ar.add(new FruitsInfo(F3,S4,600,T1));
        ar.add(new FruitsInfo(F4,S5,900,T2));
        ar.add(new FruitsInfo(F5,S2,600,T3));
        ar.add(new FruitsInfo(F6,S1,200,T2));
        ar.add(new FruitsInfo(F7,S2,500,T2));
        ar.add(new FruitsInfo(F8,S1,300,T3));
        ar.add(new FruitsInfo(F9,S3,700,T1));
        ar.add(new FruitsInfo(F10,S2,650,T2));
        ar.add(new FruitsInfo(F11,S4,800,T1));
	      Collections.sort(ar,new SortbyName());
	     log.info("\nView By Distributor Name List");
	      for (int i=0; i<ar.size(); i++){
         log.fine(""+ ar.get(i));
		  }
	}
	
	
	class Sortbycost implements Comparator<FruitsInfo>
	{
	    
	    public int compare(FruitsInfo a, FruitsInfo b)
	    {
	        return b.fruitcost - a.fruitcost;
	    }
	}
	
	class SortbyName implements Comparator<FruitsInfo>
	{
	    @Override
	    public int compare(FruitsInfo a, FruitsInfo b)
	    {
	        return b.fruitName.compareTo(a.fruitName);
	    }

	
}
}
