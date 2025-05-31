public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String email;

    private Account account;

    public void openAccount(Account account) {
        this.account = account;
    }

    public void viewAccountDetails() {
        if (account != null) {
            account.getAccountDetails();
        } else {
            System.out.println("No account found.");
        }
    }

    // Constructors, getters, setters
}
