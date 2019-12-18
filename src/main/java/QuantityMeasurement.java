
public class QuantityMeasurement
{
   private final double value;
   private final UnitValue unit;

   public QuantityMeasurement(double value, UnitValue unit)
   {
      this.unit = unit;
      this.value = value;
   }

   public boolean compare(QuantityMeasurement that) throws QuantityMeasurementException
   {
      try
      {
         Double firstValue = this.unit.convertValue()*this.value;
         Double secondValue = that.unit.convertValue()*that.value;
         return (Double.compare(firstValue,secondValue)==0);
      }
      catch (NullPointerException e)
      {
         throw new QuantityMeasurementException("Null value found", QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }

   }

   public Double additionOfTwoUnits(QuantityMeasurement that)
   {
      Double firstValue = this.unit.convertValue()*this.value;
      Double secondValue = that.unit.convertValue()*that.value;
      return (firstValue+secondValue);
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
