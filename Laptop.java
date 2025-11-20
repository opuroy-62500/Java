public class Laptop extends Device {
    private int ram;
    private static int totalLaptops;
    static {
        totalLaptops = 0;
    }

    Laptop(String brand, int price, int ram) {
        super(brand, price);
        this.ram = ram;
        totalLaptops++;
    } 
    public void setRam(int ram) {
        this.ram = ram;
    }   
    public int getRam() {
        return ram;
    }   
    void display() {
        super.displayInfo();
        System.out.println("RAM: " + ram + " GB");
    }   
    public static void displayTotalLaptops() {
        System.out.println("Total Laptops: " + totalLaptops);
    }
    
}
