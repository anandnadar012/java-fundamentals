package oop_basics;

public class UPIPayment extends Payment{
    private String upiId;

    public UPIPayment(double amount, String upiId){
        super(amount);
        this.upiId = upiId;
    }
    @Override
    public void processPayment(){
        System.out.println("Transferring $ " + amount + "via UPI ID: " + upiId);
    }
}
