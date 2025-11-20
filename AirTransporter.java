public class AirTransporter{
	String manufacturer;
	double maxAltitude;
	double maxSpeed;
	AirTransporter(){
	}
	AirTransporter(String manufacturer,double maxAltitude,double maxSpeed){
		this.manufacturer=manufacturer;
		this.maxAltitude=maxAltitude;
		this.maxSpeed=maxSpeed;
	}
	public void setManufacturer(String manufacturer){
		this.manufacturer=manufacturer;
	}
	public void setMaxAltitude(double maxAltitude){
		this.maxAltitude=maxAltitude;
	}
	public void setMaxSpeed(double maxSpeed){
		this.maxSpeed=maxSpeed;
	}
	
	public String getManufacturer(){
		return manufacturer;
	}
	public double getMaxAltitude(){
		return maxAltitude;
	}
	public double getMaxSpeed(){
		return maxSpeed;
	}
	public void showDetails(){
		System.out.println("AirTransporter");
		System.out.println("Manufacturer:"+manufacturer);
		System.out.println("MaxAltitude:"+maxAltitude+"ft");
		System.out.println("MaxSpeed:"+maxSpeed+"KM/Hr");
	}
}