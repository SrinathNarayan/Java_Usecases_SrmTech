package GenericsFruitShop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class search {
	 String name;
     static Logger log = Logger.getLogger(search.class.getName());
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
	public void fruitsearch() {
		
	log.info("Enter FruitName");
	Scanner da=new Scanner(System.in);
	name =da.nextLine();
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
    
    for(FruitsInfo f:ar)
    {
    	if(f.getFruitName().contains(name))
    	{
    		log.info("" +f);
    	}
    }
    da.close();
}
  
     }
   



