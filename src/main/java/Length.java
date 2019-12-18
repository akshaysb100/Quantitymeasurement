
public class Length
{
   private static final double FEET_TO_INCH = 12.0;
   private final double value;
   private final UnitConversion.Length unit;

   public enum Unit
   {
      FEET, INCH;
   }

   public Length(double value, UnitConversion.Length unit)
   {
      this.unit = unit;
      this.value = value;
   }

   public boolean compare(Length that) throws QuantityMeasurementException
   {
      boolean comparisionResult = false;
      try
      {

         comparisionResult = Double.compare(UnitConversion.convertValue(this.unit,this.value), UnitConversion.convertValue(that.unit,that.value)) == 0;
         return comparisionResult;
      }
      catch (NullPointerException e)
      {
         throw new QuantityMeasurementException("Null value found", QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }

   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Length length = (Length) o;
      return Double.compare(length.value, value) == 0 &&
            unit == length.unit;
   }
}
