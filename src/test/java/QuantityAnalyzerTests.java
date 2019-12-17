import org.junit.Assert;
import org.junit.Test;

public class QuantityAnalyzerTests
{
   @Test
   public void forOneFeetAndAnotherOneFeet_ShouldReturnEqual()
   {
      Feet feet1 = new Feet(1.0);
      Feet feet2 = new Feet(1.0);
      Assert.assertEquals(feet2, feet1);
   }

   @Test
   public void givenOneFeetAndAnotherFeet_ShouldReturnNotEqual()
   {
      Feet feet1 = new Feet(1.0);
      Feet feet2 = new Feet(2.0);
      Assert.assertNotEquals(feet1,feet2);
   }

   @Test
   public void givenOneInchAndAnotherOneInch_ShouldReturnEqual()
   {
      Inch inch1 = new Inch(0.0);
      Inch inch2 = new Inch(0.0);
      Assert.assertEquals(inch1,inch2);
   }

   @Test
   public void givenZeroInchAndAnotherOneInch_ShouldReturnNotEqual()
   {
      Inch inch1 = new Inch(0.0);
      Inch inch2 = new Inch(1.0);
      Assert.assertNotEquals(inch1,inch2);
   }

}

