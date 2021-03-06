public abstract class DebugBoat
{
   String boatType = new String();
   int passengers;
   String power = new String();
   public String toString;

   public DebugBoat(String bt)
   {
      boatType = bt;
   }

   public DebugBoat() {

   }

   // override equals() method to satisfy
   // requirements of Debug Exercise 3.
   public boolean equals(DebugBoat otherBoat)
   {
      boolean result;
      result = (passengers == otherBoat.passengers) && (power.equals(otherBoat.power));
      return result;
   }
   public String toString()
   {
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by " + power);
   }
   public abstract void setPower();
   public abstract void setPassengers();
}