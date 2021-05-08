   package AbcFruitShop;

import java.util.Comparator;

public class SortByDistAndGrocType implements Comparator<GroceryInfo> {

	@Override
	public int compare(GroceryInfo o1, GroceryInfo o2) {
		if(o1.Distributor.compareTo(o2.Distributor)==0)
		{
			return o1.GroceryType.compareTo(o2.GroceryType);
		}
		else
		{
			return o1.Distributor.compareTo(o2.Distributor);
		}
	}

}
