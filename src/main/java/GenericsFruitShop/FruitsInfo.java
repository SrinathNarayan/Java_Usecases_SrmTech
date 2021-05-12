package GenericsFruitShop;

public class FruitsInfo {
	
	  protected String fruitName;
	  protected String distributorName;
	  protected int fruitcost;
	  protected String catagory;
	public FruitsInfo(String fruitName, String distributorName, int fruitcost, String catagory) {
		super();
		this.fruitName = fruitName;
		this.distributorName = distributorName;
		this.fruitcost = fruitcost;
		this.catagory = catagory;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public int getFruitcost() {
		return fruitcost;
	}
	public void setFruitcost(int fruitcost) {
		this.fruitcost = fruitcost;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	@Override
	public String toString() {
		return "FruitsInfo [FruitName=" + fruitName + ", distributorName=" + distributorName + ", Fruitcost="
				+ fruitcost + ", Catagory=" + catagory + "]";
	}
	

}
