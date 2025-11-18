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
