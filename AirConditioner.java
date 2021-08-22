class AirConditioner{
	
	String company;
	int launchYear;
	String maxTemp;
	int price;
	String coolingCapacity;
	
	public static void main(String arg[]){
		
		AirConditioner orient= new AirConditioner();
		orient.company= "ORIENT" ;
		orient.launchYear= 2015 ;
		orient.maxTemp= "16 degree" ;
		orient.price= 85000 ;
		orient.coolingCapacity= "1.5 Tone" ;
		
		System.out.println("Company: "+orient.company);
		System.out.println("Launch Year: "+orient.launchYear);
		System.out.println("Max Temperature: "+orient.maxTemp);
		System.out.println("Price: "+orient.price);
		System.out.println("Cooling Capacity: "+orient.coolingCapacity);
		
		System.out.println("----------------------------");
		
		AirConditioner dawlance= new AirConditioner();
		dawlance.company= "DAWLANCE" ;
		dawlance.launchYear= 2018 ;
		dawlance.maxTemp= "17 degree" ;
		dawlance.price= 100000 ;
		dawlance.coolingCapacity= "2 Tone" ;
		
		System.out.println("Company: "+dawlance.company);
		System.out.println("Launch Year: "+dawlance.launchYear);
		System.out.println("Max Temperature: "+dawlance.maxTemp);
		System.out.println("Price: "+dawlance.price);
		System.out.println("Cooling Capacity: "+dawlance.coolingCapacity);
		
		System.out.println("----------------------------");
		
		AirConditioner kiwi= new AirConditioner();
		kiwi.company= "KIWI" ;
		kiwi.launchYear= 2017 ;
		kiwi.maxTemp= "16 degree" ;
		kiwi.price= 65000 ;
		kiwi.coolingCapacity= "1 Tone" ;
		
		System.out.println("Company: "+kiwi.company);
		System.out.println("Launch Year: "+kiwi.launchYear);
		System.out.println("Max Temperature: "+kiwi.maxTemp);
		System.out.println("Price: "+kiwi.price);
		System.out.println("Cooling Capacity: "+kiwi.coolingCapacity);
		
		System.out.println("----------------------------");
		
		AirConditioner samsung= new AirConditioner();
		samsung.company= "SAMSUNG" ;
		samsung.launchYear= 2019 ;
		samsung.maxTemp= "17 degree" ;
		samsung.price= 95000 ;
		samsung.coolingCapacity= "1.5 Tone" ;
		
		System.out.println("Company: "+samsung.company);
		System.out.println("Launch Year: "+samsung.launchYear);
		System.out.println("Max Temperature: "+samsung.maxTemp);
		System.out.println("Price: "+samsung.price);
		System.out.println("Cooling Capacity: "+samsung.coolingCapacity);
		
		System.out.println("----------------------------");
		
		AirConditioner haier= new AirConditioner();
		haier.company= "HAIER" ;
		haier.launchYear= 2020 ;
		haier.maxTemp= "16 degree" ;
		haier.price= 90000 ;
		haier.coolingCapacity= "1.5 Tone" ;
		
		System.out.println("Company: "+haier.company);
		System.out.println("Launch Year: "+haier.launchYear);
		System.out.println("Max Temperature: "+haier.maxTemp);
		System.out.println("Price: "+haier.price);
		System.out.println("Cooling Capacity: "+haier.coolingCapacity);
		
		System.out.println("----------------------------");
		
	}
}