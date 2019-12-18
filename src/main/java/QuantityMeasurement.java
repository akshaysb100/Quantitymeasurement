
public class QuantityMeasurement
{
   private final double value;
   private final UnitConversion.Length unit;

   public QuantityMeasurement(double value, UnitConversion.Length unit)
   {
      this.unit = unit;
      this.value = value;
   }

   public boolean compare(QuantityMeasurement that) throws QuantityMeasurementException
   {
      boolean comparisionResult = false;
      try
      {
         Double firstValue = UnitConversion.convertValue(this.unit, this.value);
         Double secondValue = UnitConversion.convertValue(that.unit, that.value);
            comparisionResult = Double.compare(firstValue,secondValue ) == 0;
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
      QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
      return Double.compare(quantityMeasurement.value, value) == 0 &&
            unit == quantityMeasurement.unit;
   }
}
