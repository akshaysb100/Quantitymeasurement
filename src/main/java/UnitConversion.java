public class UnitConversion
{
   public enum Length
   {
      FEET{
         public Double convertedValue(Double value){
            return value;
         }
      },INCH{
      public Double convertedValue(Double value){
         return value;
      }
   },YARD{
      public Double convertedValue(Double value){
         return value;
      }
   },FEET_TO_INCH{
         public Double convertedValue(Double value){
            return value =value*12;

         }
      },INCH_TO_FEET{
      public Double convertedValue(Double value){
         return value =value/12;
      }
   },INCH_TO_YARD{
      public Double convertedValue(Double value){
         return value =value/36;
      }
   },YARD_TO_INCH{
      public Double convertedValue(Double value){
         return value =value*36;
      }
   },YARD_TO_FEET{
      public Double convertedValue(Double value){ return value/3; }
   },FEET_TO_YARD{
      public Double convertedValue(Double value){
         return value =value*3;
      }
   };
      public Double convertedValue(Double value){return value;};
   }

   public static Double convertValue(UnitConversion.Length unit, Double value)
   {
      return value=unit.convertedValue(value);
   }
}