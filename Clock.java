class Clock{
	
	String modelName;
	int numberOfNeedles;
	int priceOfClock;
	String colorOfClock;
	String colorOfNeedles;
		
	public static void main(String arg[]){
		
		Clock hito= new Clock();
		hito.modelName = "HITO";
		hito.numberOfNeedles= 3;
		hito.priceOfClock= 1000;
		hito.colorOfClock= "Green";
		hito.colorOfNeedles= "Black";
		
		System.out.println("Model: "+hito.modelName);
		System.out.println("Number of Needles: "+hito.numberOfNeedles);
		System.out.println("Price of Clock: "+hito.priceOfClock);
		System.out.println("Color of Clock: "+hito.colorOfClock);
		System.out.println("Color of Needles: "+hito.colorOfNeedles);
		
		System.out.println("--------------------------");
		
		Clock seiko= new Clock();
		seiko.modelName = "SEIKO";
		seiko.numberOfNeedles= 3;
		seiko.priceOfClock= 1500;
		seiko.colorOfClock= "Brown";
		seiko.colorOfNeedles= "Black";
		
		System.out.println("Model: "+seiko.modelName);
		System.out.println("Number of Needles: "+seiko.numberOfNeedles);
		System.out.println("Price of Clock: "+seiko.priceOfClock);
		System.out.println("Color of Clock: "+seiko.colorOfClock);
		System.out.println("Color of Needles: "+seiko.colorOfNeedles);
		
		System.out.println("--------------------------");
		
		Clock svinz= new Clock();
		svinz.modelName = "SVINZ";
		svinz.numberOfNeedles= 3;
		svinz.priceOfClock= 2500;
		svinz.colorOfClock= "Golden";
		svinz.colorOfNeedles= "Red";
		
		System.out.println("Model: "+svinz.modelName);
		System.out.println("Number of Needles: "+svinz.numberOfNeedles);
		System.out.println("Price of Clock: "+svinz.priceOfClock);
		System.out.println("Color of Clock: "+svinz.colorOfClock);
		System.out.println("Color of Needles: "+svinz.colorOfNeedles);
		
		System.out.println("--------------------------");
		
		Clock lenova= new Clock();
		lenova.modelName = "LENOVA";
		lenova.numberOfNeedles= 3;
		lenova.priceOfClock= 3000;
		lenova.colorOfClock= "Cream";
		lenova.colorOfNeedles= "Blue";
		
		System.out.println("Model: "+lenova.modelName);
		System.out.println("Number of Needles: "+lenova.numberOfNeedles);
		System.out.println("Price of Clock: "+lenova.priceOfClock);
		System.out.println("Color of Clock: "+lenova.colorOfClock);
		System.out.println("Color of Needles: "+lenova.colorOfNeedles);
		
		System.out.println("--------------------------");
		
		Clock leap= new Clock();
		leap.modelName = "LEAP";
		leap.numberOfNeedles= 3;
		leap.priceOfClock= 5000;
		leap.colorOfClock= "Grey";
		leap.colorOfNeedles= "White";
		
		System.out.println("Model: "+leap.modelName);
		System.out.println("Number of Needles: "+leap.numberOfNeedles);
		System.out.println("Price of Clock: "+leap.priceOfClock);
		System.out.println("Color of Clock: "+leap.colorOfClock);
		System.out.println("Color of Needles: "+leap.colorOfNeedles);
		
		System.out.println("--------------------------");
	}
}