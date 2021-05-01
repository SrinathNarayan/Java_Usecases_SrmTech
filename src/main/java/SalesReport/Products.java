package SalesReport;

public class Products {
	static BeveragesProducts bp;
	static VegetablesProducts vp;
	static FoodGrainsProducts fg;

	public void Beveragecocoorder() {
		bp = new BeveragesProducts(36985, 65, 130, 12, 0, "COCOLA");

		bp.showcocoladetails();
	}

	public void Beveragepepsiorder() {
		bp = new BeveragesProducts(78952, 35, 145, 12, 0, "PEPSI");

		bp.showPepsidetails();
	}

	public void VegetablesTomatoProducts() {
		vp = new VegetablesProducts(89745, 25, 150, 12, 0, "TOMATO");

		vp.showtomatodetails();
	}

	public void VegetablesPotatoProducts() {
		vp = new VegetablesProducts(78945, 35, 180, 12, 0, "POTATO");

		vp.showpotatodetails();
	}

	public void FoodGrainsRiceProducts() {
		fg = new FoodGrainsProducts(98745, 22, 250, 12, 0, "BASMATI");

		fg.showattadetails();
	}

	public void FoodGrainAttaProducts() {
		fg = new FoodGrainsProducts(78955, 89, 350, 12, 0, "CHAAKI ATTA");

		fg.showricedetails();
	}

	public void cocorate() {
		bp.cocoprice();
	}

	public void pepsirate() {
		bp.pepsiprice();
	}

	public void ricerate() {
		fg.riceprice();
		
	}

	public void attarate() {
		fg.attaprice();
		
	}

	public void tomatorate() {
		vp.tomatoprice();
	}

	public void potatorate() {
		vp.potatoprice();
	}

}
