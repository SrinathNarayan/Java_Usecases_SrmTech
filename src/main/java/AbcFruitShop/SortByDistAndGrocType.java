   package AbcFruitShop;

import java.util.Comparator;

public class SortByDistAndGrocType implements Comparator<GroceryInfo> {

	@Override
	public int compare(GroceryInfo o1, GroceryInfo o2) {
		if(o1.distributor.compareTo(o2.distributor)==0)
		{
			return o1.groceryType.compareTo(o2.groceryType);
		}
		else
		{
			return o1.distributor.compareTo(o2.distributor);
		}
	}

}
