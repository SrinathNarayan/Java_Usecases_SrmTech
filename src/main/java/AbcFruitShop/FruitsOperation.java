package AbcFruitShop;

import java.util.ArrayList;



public class FruitsOperation {
	void getDetails(ArrayList al )
	{
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
	void findByDis(ArrayList<FruitsInfo> al,String distName)
	{
		System.out.println(" Distibuted Name Searched");
		for(FruitsInfo f:al)
		{
			if(f.Distributor.equals(distName))
			{
				System.out.println(f);
			}
		}
	}
	void findByName(ArrayList<FruitsInfo> al,String Name )
	{
		System.out.println(" Fruit Name Searched");
		for(FruitsInfo f1:al)
		{
			if(f1.fruitName.equals(Name))
			{
				System.out.println(f1);
			}
		}
	}
	void findByloc(ArrayList<FruitsInfo> al,String location)
	{
		System.out.println(" Location Searched");
		for(FruitsInfo f2:al)
		{
			if(f2.location.equals(location))
			{
				System.out.println(f2);
			}
		}
	}
}
