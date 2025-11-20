public class CargoAirliner extends AirTransporter{
	int maxCargoWeight;
	CargoAirliner(){
	}
	CargoAirliner(String manufacturer,double maxltitude,double maxSpeed,int maxCargoWeight){
		super(manufacturer,maxltitude,maxSpeed);
		this.maxCargoWeight=maxCargoWeight;
	}
	public void setmaxCargoweight(int Weight){
		this.maxCargoWeight=Weight;
	}
	public int getmaxCargoWeight(){
		return maxCargoWeight;
	}
	public void showDetails(){
		super.showDetails();
	System.out.println("Max Weight Capacity:"+maxCargoWeight+"KG");
	}
}