public enum UnitOfWeights implements Unit
{
   KILOGRAM(1.0), GRAM(0.001), TONNE(1000.0);

   private final double value;

   UnitOfWeights(double value)
   {
      this.value = value;
   }

   @Override
   public Double convertValue()
   {
      return this.value;
   }
}
