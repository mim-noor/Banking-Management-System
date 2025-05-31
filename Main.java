public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm = new ATM();
        Account account = new Account();
        Customer customer = new Customer();
        ATMTechnician technician = new ATMTechnician();

        bank.addATM(atm);
        customer.openAccount(account);

        account.deposit(1000);
        account.withdraw(500);
        account.checkBalance();

        technician.maintainATM();
        atm.checkCashStatus();
    }
}
