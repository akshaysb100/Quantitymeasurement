public enum UnitOfVolume implements Unit
{

   GALLON(3.78), LITRE(1.0), MILLI_LITRE(0.001);
   public final double value;

   UnitOfVolume(double value)
   {
      this.value = value;
   }

   @Override
   public Double convertValue()
   {
      return this.value;
   }
}
