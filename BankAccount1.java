class BankAccount1 {
    String account_holder_name;
    double balance;

    static double interest_rate;

    BankAccount1(String name, double bal) 
    {
        account_holder_name = name;
        balance = bal;
    }
	static void updateInterestRate(double rate) {
        interest_rate = rate;
        System.out.println("Interest rate updated to: " + interest_rate + "%");
        System.out.println();
    }

    void calculateInterest() {
        double interest = (balance * interest_rate) / 100;
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount1.updateInterestRate(5.0);

        BankAccount1 acc1 = new BankAccount1("Krisha", 10000);
        BankAccount1 acc2 = new BankAccount1("Ananya", 20000);

        acc1.calculateInterest();
        acc2.calculateInterest();

	BankAccount1.updateInterestRate(6.0);

	System.out.println("After updating interest...");

	acc1.calculateInterest();
        acc2.calculateInterest();
    }
}
