public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    public void setAddress(String a){

        boolean hasDigit = false;

        address = a;

        for (int x = 0; x<a.length(); ++x )
            if(Character.isDigit(a.charAt(x)))
                hasDigit = true;

            if (hasDigit)
                rate = 15.00;

            else
                {
                rate = 0;
                System.out.println("Address must contain a digit ");
            }

    }

}
