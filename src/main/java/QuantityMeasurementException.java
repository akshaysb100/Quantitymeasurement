public class QuantityMeasurementException extends  Exception
{
   public enum ExceptionType{
      NULL_OBJECT
   }
   public ExceptionType exceptionType;

   public QuantityMeasurementException(String message, ExceptionType exceptionType)
   {
      super(message);
      this.exceptionType = exceptionType;
   }
}
