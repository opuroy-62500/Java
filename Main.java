<<<<<<< HEAD
public class Main{
	public static void main(String[] args){
	
	PassengerAirliner beoing747 =new PassengerAirliner("Boeing",44947,988,524);
	   beoing747.showDetails();
	   System.out.println("------");
	   CargoAirliner airbus22= new CargoAirliner();
	   
	   airbus22.setManufacturer("AirBus");
	   airbus22.setMaxAltitude(30000);
	   airbus22.setMaxSpeed(650);
	   airbus22.setmaxCargoweight(10000);
	   airbus22.showDetails();
	}
}
=======
public class Main {
	public static void main(String[] args){
    Laptop laptop[] = new Laptop[3] ;
    laptop[0] = new Laptop("Dell", 80000, 16) ;
    laptop[1] = new Laptop("HP", 90000, 8) ;   
    laptop[2] = new Laptop("Apple", 150000, 32) ; 
    for(int i=0; i<laptop.length; i++) {
        laptop[i].display();
        System.out.println("-------------------");
    }   
    Laptop.displayTotalLaptops();   
      
	
    
    
	}
}
>>>>>>> d5d6c1c54da58905b18e87caf5a86d168d4fb50c
