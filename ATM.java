public class ATM {
    private String atmID;
    private String location;
    private String status;
    private double cashAvailable;

    public void checkCashStatus() {
        System.out.println("Cash available: " + cashAvailable);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("ATM status updated to: " + status);
    }

    // Constructors, getters, setters
}

