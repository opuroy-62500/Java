public class Main1 {
    public static void main(String[] args) {
        Bank Joy = new Bank("JOY PAUL", 20000);
        Joy.displayAccountInfo();

    Bank Mehtab = new Bank("MEHTAB", 20000);
	 
        Mehtab.setBalance(40000);
        System.out.println("Mehtab updated Balance : " + Mehtab.getBalance());
        Mehtab.displayAccountInfo();
    }
}
