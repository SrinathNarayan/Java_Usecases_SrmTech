package AbcFruitShop;

import java.util.Comparator;


public class SortByNameAndLocation implements Comparator<GroceryInfo> {

	@Override
	public int compare(GroceryInfo o1, GroceryInfo o2) {
		if(o1.groceryName.compareTo(o2.groceryName)==0)
		{
			return o1.location.compareTo(o2.location);
		}
		else
		{
			return o1.groceryName.compareTo(o2.groceryName);
		}
	}

		
	}

