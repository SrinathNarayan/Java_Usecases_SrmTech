package SalesReport;

public class Products {
      static BeveragesProducts bp ;
      static VegetablesProducts v;
      static FoodGrainsProducts f;
 

	public void beveragecocoorder() {
		bp = new BeveragesProducts(96585, 12, 130, 22,0 , "COCOLA");
		bp.showcocoladetails();
	}

	public void beveragepepsiorder() {
		bp = new BeveragesProducts(78952, 35, 145, 12, 0, "PEPSI");

		bp.showPepsidetails();
	}

	public void vegetablesTomatoProducts() {
		v = new VegetablesProducts(89745, 25, 150, 12, 0, "TOMATO");

		v.showtomatodetails();
	}

	public void vegetablesPotatoProducts() {
		v = new VegetablesProducts(78945, 35, 180, 12, 0, "POTATO");

		v.showpotatodetails();
	}

	public void foodGrainsRiceProducts() {
		f = new FoodGrainsProducts(98745, 22, 250, 12, 0, "BASMATI");

		f.showattadetails();
	}

	public void foodGrainAttaProducts() {
		f = new FoodGrainsProducts(78955, 89, 350, 12, 0, "CHAAKI ATTA");

		f.showriceproductdetails();
	}

	public void cocorate() {
		bp.cocoprice();
	}

	public void pepsirate() {
		bp.pepsiprice();
	}

	public void ricerate() {
		f.riceprice();
		
	}

	public void attarate() {
		f.attaprice();
		
	}

	public void tomatorate() {
		v.tomatoprice();
	}

	public void potatorate() {
		v.potatoprice();
	}

}
