import org.junit.Assert;
import org.junit.Test;

public class QuantityAnalyzerTests
{
   @Test
   public void forOneFeetAndAnotherOneFeet_ShouldReturnEqual()
   {
      Length feet1 = new Length(1.0, Length.Unit.FEET);
      Length feet2 = new Length(1.0, Length.Unit.FEET);
      Assert.assertEquals(feet2, feet1);
   }

   @Test
   public void givenOneFeetAndAnotherFeet_ShouldReturnNotEqual()
   {
      Length feet1 = new Length(1.0, Length.Unit.FEET);
      Length feet2 = new Length(2.0, Length.Unit.FEET);
      Assert.assertNotEquals(feet1, feet2);
   }

   @Test
   public void givenOneInchAndAnotherOneInch_ShouldReturnEqual()
   {
      Length inch1 = new Length(0.0, Length.Unit.INCH);
      Length inch2 = new Length(0.0, Length.Unit.INCH);
      Assert.assertEquals(inch1, inch2);
   }

   @Test
   public void givenZeroInchAndAnotherOneInch_ShouldReturnNotEqual()
   {
      Length inch1 = new Length(0.0, Length.Unit.INCH);
      Length inch2 = new Length(2.0, Length.Unit.INCH);
      Assert.assertNotEquals(inch1, inch2);
   }

   @Test
   public void givenOneFeetAndOneInch_ShouldReturnNotEqual()
   {
      Length inch1 = new Length(1.0, Length.Unit.FEET);
      Length feet1 = new Length(1.0, Length.Unit.INCH);
      Assert.assertNotEquals(inch1, feet1);
   }

   @Test
   public void comparingZeroInchAndZeroFeet_ShouldReturnEqualLength()
   {
      Length inch1 = new Length(0.0, Length.Unit.FEET);
      Length feet1 = new Length(0.0, Length.Unit.INCH);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void comparingZeroInchAnd1Feet_ShouldReturnNotEqualLength()
   {
      Length inch1 = new Length(0.0, Length.Unit.FEET);
      Length feet1 = new Length(1.0, Length.Unit.INCH);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertFalse(compareCheck);
   }

   @Test
   public void  givenOneFeetAndOneFeet_WhenCompered_ShouldReturnEqualLength()
   {
      Length inch1 = new Length(1.0, Length.Unit.FEET);
      Length feet1 = new Length(1.0, Length.Unit.FEET);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void  givenOneInchAndOneInch_WhenCompered_ShouldReturnEqualLength()
   {
      Length inch1 = new Length(1.0, Length.Unit.INCH);
      Length feet1 = new Length(1.0, Length.Unit.INCH);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void  givenOneInchAndOneFeet_WhenCompered_ShouldReturnEqualLength()
   {
      Length inch1 = new Length(1.0, Length.Unit.INCH);
      Length feet1 = new Length(1.0, Length.Unit.FEET);
      Boolean compareCheck = inch1.compare(feet1);
      Assert.assertTrue(compareCheck);
   }
}

