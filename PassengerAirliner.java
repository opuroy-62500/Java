public class PassengerAirliner extends AirTransporter{
	int passengerCapacity;

	PassengerAirliner(String manufacturer,double maxltitude,double maxSpeed,int passengerCapacity){
		super(manufacturer,maxltitude,maxSpeed);
		
		this.passengerCapacity=passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity){
		this.passengerCapacity=passengerCapacity;
	}
	public int getPassengerCapacity(){
		return passengerCapacity;
	}
	public void showDetails(){
		super.showDetails();
	System.out.println("PassengerCapacity:"+passengerCapacity);
	}
}