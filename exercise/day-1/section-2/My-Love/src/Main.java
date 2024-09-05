public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("68765");
        account.setAccountHolder("Joko");
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Your Account Name: " + account.getAccountHolder());
        System.out.println("Current Balance: " + account.getBalance());
    }
}