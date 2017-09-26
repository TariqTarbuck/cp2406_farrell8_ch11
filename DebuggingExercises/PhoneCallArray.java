public class PhoneCallArray {

    public static void main(String[] args) {
        PhoneCall calls[] = new PhoneCall[10];

        int counter;

        calls[0] = new IncomingPhoneCall("04589324582");
        calls[1] = new IncomingPhoneCall("04589324582");
        calls[2] = new IncomingPhoneCall("04589324582");
        calls[3] = new IncomingPhoneCall("04589324582");
        calls[4] = new IncomingPhoneCall("04589324582");
        calls[5] = new OutgoingPhoneCall("04589324582", 02);
        calls[6] = new IncomingPhoneCall("04589324582");
        calls[7] = new IncomingPhoneCall("04589324582");
        calls[8] = new IncomingPhoneCall("04589324582");
        calls[9] = new OutgoingPhoneCall("04589324582", 65);

        for(counter = 0; counter < calls.length; ++counter){
            calls[counter].getInformation();
        }
    }
}
