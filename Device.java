public  class Device   {
    private String brand;
    private int price;


    public Device(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }  
   
    
    public void displayInfo() {
        System.out.println("Brand: " + brand ) ;
        System.out.println("Price: " + price ) ;
    }
}
