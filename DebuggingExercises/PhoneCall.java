public abstract class PhoneCall {

    String phoneNumber;
    double price;

    public PhoneCall(String number){
        phoneNumber = number;
        price = 0.0;
    }

    public void setPrice(double pri){
        price = pri;
    }

    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInformation();

}
