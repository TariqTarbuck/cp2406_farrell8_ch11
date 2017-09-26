public class OnlineNewspaperSubscription extends NewspaperSubscription {


    public void setAddress(String a) {

        boolean hasAtSign = false;
        address = a;

        for(int x = 0; x< a.length(); ++x)
            if (a.charAt(x) == '@')
                hasAtSign = true;

            if (hasAtSign)
                rate = 9.0;

            else {
                rate = 0;
                System.out.println("Address must contain an at sign '@' ");
            }

    }
}
