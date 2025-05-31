import java.util.ArrayList;

public class Bank {
    private String bankID;
    private String name;
    private String address;
    private int phone;
    private String ifscCode;

    private ArrayList<ATM> atms = new ArrayList<>();

    public void addATM(ATM atm) {
        atms.add(atm);
    }

    public void viewBankInfo() {
        System.out.println("Bank Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("IFSC Code: " + ifscCode);
    }

    // Constructors, getters, setters
}
