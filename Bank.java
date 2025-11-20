public class Bank {
    // Static (class-level) variables
    private static int totalAccounts ;
    private static String bankName ;

    // Instance (object-level) variables
    private String accountHolder;
    private double balance;

    // Constructor
    public Bank(String accountHolder, double balance) {
        System.out.println("constructor: Creating Account ");
        this.accountHolder = accountHolder;
        this.balance = balance;

        totalAccounts++;
       
    }

    // Setter (Encapsulation)
    public void setBalance(double newBalance) {
        System.out.println("Setbalance called");
        this.balance = newBalance;
    }

    // Getter (Encapsulation)
    public double getBalance() {
        System.out.println("getbalance called");
        return this.balance;
    }

    // Method to display account info
    public void displayAccountInfo() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
		System.out.println("Registered Account : " + totalAccounts);
    } 
	// Static block (runs once when the class loads)
	static {
        bankName = "Secure Bank Ltd";
		totalAccounts = 0;
        System.out.println("static block : Bank System loaded");
        System.out.println("Bank Name : " + bankName);
        System.out.println("Total Accounts: " + totalAccounts);
		
		
    }

}
