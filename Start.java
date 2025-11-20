public class Start{
	public static void main(String[] args){
		Book b1 = new Book("java","Opu",200);
		b1.showdetails();
		Book b2 = new Book("Math 0","Nobel",1000);
		b2.showdetails();
		Book b3 = new Book("WWW","Mr. Meow",250);
		b3.showdetails();
		b3.setprice(500);
		b3.showdetails();
		
	}
}