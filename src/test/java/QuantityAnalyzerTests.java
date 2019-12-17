import org.junit.Assert;
import org.junit.Test;

public class QuantityAnalyzerTests
{
   @Test
   public void forOneFeetAndAnotherFeet_ShouldReturnEqual()
   {
      Feet feet1 = new Feet(0.0);
      Feet feet2 = new Feet(0.0);
      Assert.assertEquals(feet2, feet1);
   }
}
