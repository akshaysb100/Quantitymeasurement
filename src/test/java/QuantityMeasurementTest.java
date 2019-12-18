import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest
{

   @Test
   public void forOneFeetAndAnotherOneFeet_ShouldReturnEqual()
   {
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0,UnitValue.FEET);
      QuantityMeasurement feet2 = new QuantityMeasurement(1.0, UnitValue.FEET);
      Assert.assertEquals(feet2, feet1);
   }

   @Test
   public void givenOneFeetAndAnotherFeet_ShouldReturnNotEqual()
   {
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitValue.FEET);
      QuantityMeasurement feet2 = new QuantityMeasurement(2.0,UnitValue.FEET);
      Assert.assertNotEquals(feet1, feet2);
   }

   @Test
   public void givenOneInchAndAnotherOneInch_ShouldReturnEqual()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(0.0,UnitValue.INCH);
      QuantityMeasurement inch2 = new QuantityMeasurement(0.0,UnitValue.INCH);
      Assert.assertEquals(inch1, inch2);
   }

   @Test
   public void givenZeroInchAndAnotherOneInch_ShouldReturnNotEqual()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(0.0, UnitValue.INCH);
      QuantityMeasurement inch2 = new QuantityMeasurement(2.0,UnitValue.INCH);
      Assert.assertNotEquals(inch1, inch2);
   }

   @Test
   public void givenOneFeetAndOneInch_ShouldReturnNotEqual()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitValue.FEET);
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0,UnitValue.INCH);
      Assert.assertNotEquals(inch1, feet1);
   }

   @Test
   public void comparingZeroInchAndZeroFeet_ShouldReturnEqualLength()
   {
      try
      {
         QuantityMeasurement inch1 = new QuantityMeasurement(0.0,UnitValue.FEET);
         QuantityMeasurement feet1 = new QuantityMeasurement(0.0,UnitValue.INCH);
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
         QuantityMeasurement inch1 = new QuantityMeasurement(1.0,UnitValue.FEET);
         QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitValue.INCH);
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
         QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitValue.INCH);
         QuantityMeasurement feet1 = new QuantityMeasurement(1.0,UnitValue.FEET);
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
         QuantityMeasurement inch1 = new QuantityMeasurement(1.0,UnitValue.INCH);
         QuantityMeasurement feet1 = new QuantityMeasurement(1.0,UnitValue.INCH);
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
         QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitValue.INCH);
         QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitValue.FEET);
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
         QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitValue.INCH);
         QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitValue.INCH);
         Boolean compareCheck = feet1.compare(inch1);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }


   @Test
   public void givenOneYardAndOneYard_WhenCompered_ShouldReturnFalse()
   {
      try
      {
         QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitValue.YARD);
         QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitValue.YARD);
         Boolean compareCheck = feet1.compare(inch1);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void givenOneInchAndOneYard_WhenCompered_ShouldReturnFalse()
   {
      try
      {
         QuantityMeasurement inch1 = new QuantityMeasurement(1.0,UnitValue.INCH);
         QuantityMeasurement yard1 = new QuantityMeasurement(1.0,UnitValue.YARD);
         Boolean compareCheck = inch1.compare(yard1);
         Assert.assertFalse(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void given36InchAndOneYard_WhenCompered_ShouldReturnTrue()
   {
      try
      {
         QuantityMeasurement inch1 = new QuantityMeasurement(36.0,UnitValue.INCH);
         QuantityMeasurement yard1 = new QuantityMeasurement(1.0,UnitValue.YARD);
         Boolean compareCheck = inch1.compare(yard1);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }


   @Test
   public void given3FeetAndOneYard_WhenCompered_ShouldReturnTrue()
   {
      try
      {
         QuantityMeasurement inch1 = new QuantityMeasurement(3.0,UnitValue.FEET);
         QuantityMeasurement yard1 = new QuantityMeasurement(1.0,UnitValue.YARD);
         Boolean compareCheck = inch1.compare(yard1);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void givenOneFeetAnd3Yard_WhenCompered_ShouldReturnFalse()
   {
      try
      {
         QuantityMeasurement feet1 = new QuantityMeasurement(1.0,UnitValue.FEET);
         QuantityMeasurement yard1 = new QuantityMeasurement(3.0,UnitValue.YARD);
         Boolean compareCheck = feet1.compare(yard1);
         Assert.assertFalse(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }

   @Test
   public void given2InchAnd5CentiMeter_WhenCompered_ShouldReturnTrue()
   {
      try
      {
         QuantityMeasurement inch = new QuantityMeasurement(2.0,UnitValue.INCH);
         QuantityMeasurement centiMeter = new QuantityMeasurement(5.0,UnitValue.CENTI_METER);
         Boolean compareCheck = inch.compare(centiMeter);
         Assert.assertTrue(compareCheck);
      }
      catch (QuantityMeasurementException e)
      {
         Assert.assertEquals(e.exceptionType, QuantityMeasurementException.ExceptionType.NULL_OBJECT);
      }
   }
}

