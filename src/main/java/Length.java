import java.util.Objects;

public class Length
{
   private static final double FEET_TO_INCH = 12.0;
   private final double value;
   private final Unit unit;

   public enum Unit
   {
      FEET, INCH;
   }

   public Length(double value, Unit unit)
   {
      this.unit = unit;
      this.value = value;
   }

   public boolean compare(Length that) throws QuantityMeasurementException
   {
      try
      {
         if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
         else if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
         else if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value) == 0;
         else if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value*FEET_TO_INCH) == 0;

      }
      catch (NullPointerException e){
         throw new QuantityMeasurementException("Null value found",QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
      return false;
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
