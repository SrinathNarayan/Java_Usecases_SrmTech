package AbcFruitShop;

import java.util.ArrayList;
import java.util.logging.Logger;



public class FruitsOperation {
	static Logger log = Logger.getLogger(FruitsOperation.class.getName());
	void getDetails(ArrayList<FruitsInfo> al )
	{
		for(int i=0;i<al.size();i++)
		{
			log.fine(""+al.get(i));
		}
	}
	void findByDis(ArrayList<FruitsInfo> al,String distName)
	{
		log.info(" Distibutor  Name Searched");
		for(FruitsInfo f:al)
		{
			if(f.distributor.equals(distName))
			{
				log.fine(" "+f);
			}
		}
	}
	void findByName(ArrayList<FruitsInfo> al,String Name )
	{
		log.info(" Fruit Name Searched");
		for(FruitsInfo f1:al)
		{
			if(f1.fruitName.equals(Name))
			{
				log.fine(" " + f1);
			}
		}
	}
	void findByloc(ArrayList<FruitsInfo> al,String location)
	{
		log.info(" Location Searched");
		for(FruitsInfo f2:al)
		{
			if(f2.location.equals(location))
			{
				log.info(" " + f2);
			}
		}
	}
}
