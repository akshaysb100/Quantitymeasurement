import jdk.nashorn.internal.runtime.regexp.joni.ast.QuantifierNode;

public enum UnitValue
{
   INCH(1), FEET(12), YARD(36),CENTI_METER(0.4 );

   public final double value;

   UnitValue(double quantifierNode)
   {
      this.value = quantifierNode;
   }

   public Double convertValue()
   {
      return this.value;
   }
}
