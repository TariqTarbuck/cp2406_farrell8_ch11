public abstract class NewspaperSubscription {

    protected String name;
    protected double rate;
    protected String address;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }


    public double getRate() {
        return rate;
    }

    public abstract void setAddress(String s);
}


