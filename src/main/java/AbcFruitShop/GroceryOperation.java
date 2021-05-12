package AbcFruitShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;


public class GroceryOperation {
	static Logger log = Logger.getLogger(GroceryOperation.class.getName());
	void getDetails(ArrayList<GroceryInfo> al )
	{
		for(int i=0;i<al.size();i++)
		{
			log.fine( "" + al.get(i));
		}
	}
	void sortByDistAndGroceryType(ArrayList<GroceryInfo> al)
	{
		Collections.sort(al,new SortByDistAndGrocType());
		for(int i=0;i<al.size();i++)
		{
			log.fine( "" + al.get(i));
		}
	}
	void SortByCostAndExpiry(ArrayList<GroceryInfo> al)
	{
		Collections.sort(al,new SortByCostAndExpiry());
		for(int i=0;i<al.size();i++)
		{
			log.fine( "" +al.get(i));
		}
	}
	void findByDis(ArrayList<GroceryInfo> al,String distName)
	{
	log.info("Searched By Name");
		for(GroceryInfo g:al)
		{
			if(g.distributor.equals(distName))
			{
				log.fine( "" +g);
			}
		}
	}
	}


