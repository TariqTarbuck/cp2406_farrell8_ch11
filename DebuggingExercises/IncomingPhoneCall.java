public class IncomingPhoneCall extends PhoneCall {

    public final static double callRate = 0.02;

    public IncomingPhoneCall(String numb){
        super(numb);
        price = callRate;
    }

    public void getInformation(){

        System.out.println("Incoming phone call " + getPhoneNumber()+ callRate + "per call Which comes to a grand total of: "
        +getPrice());
    }


    public double getPrice() {
        return price;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

}
