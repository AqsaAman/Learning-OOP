class SmartPhone{
	
	String company;
	String model;
	int price;
	double screenSize;
	String internalMemory;
	
	public static void main(String arg[]){
		
		SmartPhone samsung= new SmartPhone();
		samsung.company= "SAMSUNG";
		samsung.model= "S8 2018";
		samsung.price= 75000;
		samsung.screenSize= 6.4 ;
		samsung.internalMemory= "128GB" ;
		
		System.out.println("Company Name: "+samsung.company);
		System.out.println("Model: "+samsung.model);
		System.out.println("Price: "+samsung.price);
		System.out.println("Screen Size in Inches: "+samsung.screenSize);
		System.out.println("Internal Memory: "+samsung.internalMemory);
		
		System.out.println("------------------------------");
		
		SmartPhone oppo= new SmartPhone();
		oppo.company= "OPPO";
		oppo.model= "A9 2020";
		oppo.price= 45000;
		oppo.screenSize= 6.1 ;
		oppo.internalMemory= "64GB" ;
		
		System.out.println("Company Name: "+oppo.company);
		System.out.println("Model: "+oppo.model);
		System.out.println("Price: "+oppo.price);
		System.out.println("Screen Size in Inches: "+oppo.screenSize);
		System.out.println("Internal Memory: "+oppo.internalMemory);
		
		System.out.println("------------------------------");
		
		SmartPhone vivo= new SmartPhone();
		vivo.company= "VIVO";
		vivo.model= "S1 2019";
		vivo.price= 31000;
		vivo.screenSize= 5.8 ;
		vivo.internalMemory= "128GB" ;
		
		System.out.println("Company Name: "+vivo.company);
		System.out.println("Model: "+vivo.model);
		System.out.println("Price: "+vivo.price);
		System.out.println("Screen Size in Inches: "+vivo.screenSize);
		System.out.println("Internal Memory: "+vivo.internalMemory);
		
		System.out.println("------------------------------");
	
		SmartPhone nokia= new SmartPhone();
		nokia.company= "NOKIA";
		nokia.model= "G20 2021";
		nokia.price= 85000;
		nokia.screenSize= 6.0 ;
		nokia.internalMemory= "256GB" ;
		
		System.out.println("Company Name: "+nokia.company);
		System.out.println("Model: "+nokia.model);
		System.out.println("Price: "+nokia.price);
		System.out.println("Screen Size in Inches: "+nokia.screenSize);
		System.out.println("Internal Memory: "+nokia.internalMemory);
		
		System.out.println("------------------------------");
	
		SmartPhone huawei= new SmartPhone();
		huawei.company= "HUAWEI";
		huawei.model= "Y7A 2018";
		huawei.price= 32000;
		huawei.screenSize= 6.2 ;
		huawei.internalMemory= "64GB" ;
		
		System.out.println("Company Name: "+huawei.company);
		System.out.println("Model: "+huawei.model);
		System.out.println("Price: "+huawei.price);
		System.out.println("Screen Size in Inches: "+huawei.screenSize);
		System.out.println("Internal Memory: "+huawei.internalMemory);
		
		System.out.println("------------------------------");
	}
	
}