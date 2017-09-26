public class OutgoingPhoneCall extends PhoneCall {
    public final static double callRate = 0.04;
    private int callMinutes;

    public OutgoingPhoneCall(String number, int minutes){
        super(number);
        callMinutes = minutes;
        price = (minutes * callRate);
    }

    public void getInformation(){

        System.out.println("Outgoing phone call " + getPhoneNumber()+ callRate + "per call Which comes to a grand total of: "
                +getPrice());
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public double getPrice() {
        return price;
    }
}
