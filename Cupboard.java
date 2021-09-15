class Cupboard{
	
	String material;
	String brand;
	int volume;
	int noOfCabinets;
	int price;
	
	public static void main(String arg[]){
		
		Cupboard ikea=new Cupboard();
		ikea.material= "Wooden";
		ikea.brand= "IKEA";
		ikea.volume= 3465;
		ikea.noOfCabinets= 4;
		ikea.price= 50000;
		
		System.out.println("Material: "+ikea.material);
		System.out.println("Brand: "+ikea.brand);
		System.out.println("Volume: "+ikea.volume+" meter cube");
		System.out.println("No of Cabinets: "+ikea.noOfCabinets);
		System.out.println("Price: "+ikea.price);
		
		System.out.println("------------------------------");
		
		Cupboard kartell=new Cupboard();
		kartell.material= "Woooden" ;
		kartell.brand= "KARTELLL";
		kartell.volume= 4567 ;
		kartell.noOfCabinets= 3;
		kartell.price= 45000;
		
		System.out.println("Material: "+kartell.material);
		System.out.println("Brand: "+kartell.brand);
		System.out.println("volume: "+kartell.volume+" meter cube");
		System.out.println("No of Cabinets: "+kartell.noOfCabinets);
		System.out.println("Price: "+kartell.price);
		
		System.out.println("------------------------------");
		
		Cupboard dwell=new Cupboard();
		dwell.material= "Plastic" ;
		dwell.brand= "DWELL" ;
		dwell.volume= 2550 ;
		dwell.noOfCabinets= 2 ;
		dwell.price= 10000 ;
		
		System.out.println("Material: "+dwell.material);
		System.out.println("Brand: "+dwell.brand);
		System.out.println("volume: "+dwell.volume+" meter cube");
		System.out.println("No of Cabinets: "+dwell.noOfCabinets);
		System.out.println("Price: "+dwell.price);
		
		System.out.println("------------------------------");
		
		Cupboard scaleinch=new Cupboard();
		scaleinch.material= "Laminates";
		scaleinch.brand= "SCALEINCH";
		scaleinch.volume= 3765;
		scaleinch.noOfCabinets= 3;
		scaleinch.price= 25000;
		
		System.out.println("Material: "+scaleinch.material);
		System.out.println("Brand: "+scaleinch.brand);
		System.out.println("volume: "+scaleinch.volume+" meter cube");
		System.out.println("No of Cabinets: "+scaleinch.noOfCabinets);
		System.out.println("Price: "+scaleinch.price);
		
		System.out.println("------------------------------");
		
		Cupboard bluwood=new Cupboard();
		bluwood.material= "plywood";
		bluwood.brand= "BLUWOOD" ;
		bluwood.volume= 5500;
		bluwood.noOfCabinets= 4;
		bluwood.price= 70000;
		
		System.out.println("Material: "+bluwood.material);
		System.out.println("Brand: "+bluwood.brand);
		System.out.println("volume: "+bluwood.volume+" meter cube");
		System.out.println("No of Cabinets: "+bluwood.noOfCabinets);
		System.out.println("Price: "+bluwood.price);
		
		System.out.println("------------------------------");
	}
}