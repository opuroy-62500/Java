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