package AbcFruitShop;

import java.util.Comparator;




	public class SortByCostAndExpiry implements Comparator<GroceryInfo> {

		@Override
		public int compare(GroceryInfo o1, GroceryInfo o2) {
			if(o1.GroceryType.compareTo(o2.GroceryType)==0)
			{
				return o1.expiryDate.compareTo(o2.expiryDate);
			}
			else
			{
				return o1.expiryDate.compareTo(o2.expiryDate);
			}
		}
			
		}

