public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower();
   }

////   @Override
//   public void setPower() {
//
//   }

   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void setPower()
   {
      super.power = "four engines";
   }
}
