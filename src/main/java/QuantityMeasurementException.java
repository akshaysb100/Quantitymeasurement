public class QuantityMeasurementException extends Exception
{
   public enum ExceptionType{
      UNIT_NOT_COMPARABLE;
   }
   public ExceptionType type;

   public QuantityMeasurementException(String message, ExceptionType exceptionType)
   {
      super(message);
      this.type = exceptionType;
   }
}
