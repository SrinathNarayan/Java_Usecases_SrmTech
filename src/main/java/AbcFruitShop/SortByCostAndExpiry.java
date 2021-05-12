package AbcFruitShop;

import java.util.Comparator;




	public class SortByCostAndExpiry implements Comparator<GroceryInfo> {

		@Override
		public int compare(GroceryInfo o1, GroceryInfo o2) {
			if(o1.groceryType.compareTo(o2.groceryType)==0)
			{
				return o1.expiryDate.compareTo(o1.expiryDate);
			}
			else
			{
				return o2.expiryDate.compareTo(o2.expiryDate);
			}
		}
			
		}

