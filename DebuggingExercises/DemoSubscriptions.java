public class DemoSubscriptions {

    public static void main(String[] args) {


        PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
        PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();


        pnsBad.setName("Livid");
        pnsBad.setAddress("31 Pink Street");
        display(pnsBad);

        pnsGood.setName("Mick");
        pnsGood.setAddress("3 Mont Close");
        display(pnsGood);

        onsGood.setName("JKames");
        onsGood.setAddress("32 Danziel");
        display(onsGood);

        onsBad.setName("JKames");
        onsBad.setAddress("32 Danziel");
        display(onsBad);
    }

        public static void display(NewspaperSubscription name){
            System.out.println("Name: "+name.getName()+ "Address: " +name.getAddress() + "Rate +" +
                    name.getRate());

    }

    }

