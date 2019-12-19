public enum UnitOfTemperature implements Unit
{
   FAHRENHEIT(32.0),CELSIUS(1.0);


   private final double temperature;

   UnitOfTemperature(double temperature)
   {
      this.temperature = temperature;
   }

   @Override
   public Double convertValue()
   {
      return this.temperature;
   }

}
