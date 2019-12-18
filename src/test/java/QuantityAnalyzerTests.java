import org.junit.Assert;
import org.junit.Test;

public class QuantityAnalyzerTests
{
   @Test
   public void forOneFeetAndAnotherOneFeet_ShouldReturnEqual()
   {
      Length feet1 = new Length(1.0, UnitConversion.Length.FEET);
      Length feet2 = new Length(1.0, UnitConversion.Length.FEET);
      Assert.assertEquals(feet2, feet1);
   }

   @Test
   public void givenOneFeetAndAnotherFeet_ShouldReturnNotEqual()
   {
      Length feet1 = new Length(1.0, UnitConversion.Length.FEET);
      Length feet2 = new Length(2.0,UnitConversion.Length.FEET);
      Assert.assertNotEquals(feet1, feet2);
   }

   @Test
   public void givenOneInchAndAnotherOneInch_ShouldReturnEqual()
   {
      Length inch1 = new Length(0.0,UnitConversion.Length.INCH);
      Length inch2 = new Length(0.0,UnitConversion.Length.INCH);
      Assert.assertEquals(inch1, inch2);
   }

   @Test
   public void givenZeroInchAndAnotherOneInch_ShouldReturnNotEqual()
   {
      Length inch1 = new Length(0.0, UnitConversion.Length.INCH);
      Length inch2 = new Length(2.0,UnitConversion.Length.INCH);
      Assert.assertNotEquals(inch1, inch2);
   }

   @Test
   public void givenOneFeetAndOneInch_ShouldReturnNotEqual()
   {
      Length inch1 = new Length(1.0, UnitConversion.Length.FEET);
      Length feet1 = new Length(1.0,UnitConversion.Length.INCH);
      Assert.assertNotEquals(inch1, feet1);
   }

   @Test
   public void comparingZeroInchAndZeroFeet_ShouldReturnEqualLength()
   {
      try
      {
         Length inch1 = new Length(0.0,UnitConversion.Length.FEET);
         Length feet1 = new Length(0.0,UnitConversion.Length.INCH);
         Boolean compareCheck = feet1.compare(inch1);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void comparingZeroInchAnd1Feet_ShouldReturnNotEqualLength()
   {
      try
      {
         Length inch1 = new Length(1.0, UnitConversion.Length.FEET);
         Length feet1 = new Length(4.0, UnitConversion.Length.INCH);
         Boolean compareCheck = inch1.compare(feet1);
         Assert.assertFalse(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void givenOneFeetAndOneFeet_WhenCompered_ShouldReturnEqualLength()
   {
      try
      {
         Length inch1 = new Length(1.0, UnitConversion.Length.INCH_TO_FEET);
         Length feet1 = new Length(1.0,UnitConversion.Length.INCH);
         Boolean compareCheck = feet1.compare(inch1);
         Assert.assertFalse(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void givenOneInchAndOneInch_WhenCompered_ShouldReturnEqualLength()
   {
      try
      {
         Length inch1 = new Length(1.0, UnitConversion.Length.INCH);
         Length feet1 = new Length(1.0,UnitConversion.Length.INCH);
         Boolean compareCheck = feet1.compare(inch1);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void givenOneInchAndOneFeet_WhenCompered_ShouldReturnNotEqualLength()
   {
      try
      {
         Length inch1 = new Length(1.0, UnitConversion.Length.INCH);
         Length feet1 = new Length(1.0, UnitConversion.Length.FEET_TO_INCH);
         Boolean compareCheck = feet1.compare(inch1);
         Assert.assertFalse(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void givenOneInchAndOneInch_WhenCompered_ShouldReturnFalse()
   {
      try
      {
         Length inch1 = new Length(1.0, UnitConversion.Length.INCH);
         Length feet1 = new Length(1.0, UnitConversion.Length.INCH);
         Boolean compareCheck = feet1.compare(inch1);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void givenOneInch_WhenComperedWithNull_ShouldThrowException()
   {
      try
      {
         Length inch1 = new Length(1.0,UnitConversion.Length.INCH);
         Boolean compareCheck = inch1.compare(null);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }
}

