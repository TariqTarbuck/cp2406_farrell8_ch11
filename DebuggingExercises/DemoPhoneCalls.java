public class DemoPhoneCalls {

    public static void main(String[] args) {


        IncomingPhoneCall incomingCall = new IncomingPhoneCall("0400880044");
        OutgoingPhoneCall outgoingCall = new OutgoingPhoneCall("65418484", 10);

        incomingCall.getPrice();
        outgoingCall.getPrice();
    }


}
