import org.junit.Assert;
import org.junit.Test;

public class QuantityComparisionTest
{
   @Test
   public void forOneFeetAndAnotherOneFeet_ShouldReturnEqual()
   {
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      QuantityMeasurement feet2 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      Assert.assertEquals(feet2, feet1);
   }

   @Test
   public void givenOneFeetAndAnotherFeet_ShouldReturnNotEqual()
   {
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      QuantityMeasurement feet2 = new QuantityMeasurement(2.0, UnitOfLength.FEET);
      Assert.assertNotEquals(feet1, feet2);
   }

   @Test
   public void givenOneInchAndAnotherOneInch_ShouldReturnEqual()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(0.0, UnitOfLength.INCH);
      QuantityMeasurement inch2 = new QuantityMeasurement(0.0, UnitOfLength.INCH);
      Assert.assertEquals(inch1, inch2);
   }

   @Test
   public void givenZeroInchAndAnotherOneInch_ShouldReturnNotEqual()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(0.0, UnitOfLength.INCH);
      QuantityMeasurement inch2 = new QuantityMeasurement(2.0, UnitOfLength.INCH);
      Assert.assertNotEquals(inch1, inch2);
   }

   @Test
   public void givenOneFeetAndOneInch_ShouldReturnNotEqual()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      Assert.assertNotEquals(inch1, feet1);
   }

   @Test
   public void comparingZeroInchAndZeroFeet_ShouldReturnEqualLength()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(0.0, UnitOfLength.FEET);
      QuantityMeasurement feet1 = new QuantityMeasurement(0.0, UnitOfLength.INCH);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void comparingZeroInchAnd1Feet_ShouldReturnNotEqualLength()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      Boolean compareCheck = inch1.compare(feet1);
      Assert.assertFalse(compareCheck);
   }

   @Test
   public void givenOneFeetAndOneFeet_WhenCompered_ShouldReturnEqualLength()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertFalse(compareCheck);
   }

   @Test
   public void givenOneInchAndOneInch_WhenCompered_ShouldReturnEqualLength()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void givenOneInchAndOneFeet_WhenCompered_ShouldReturnNotEqualLength()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertFalse(compareCheck);
   }

   @Test
   public void givenOneInchAndOneInch_WhenCompered_ShouldReturnFalse()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertTrue(compareCheck);
   }


   @Test
   public void givenOneYardAndOneYard_WhenCompered_ShouldReturnFalse()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitOfLength.YARD);
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.YARD);
      Boolean compareCheck = feet1.compare(inch1);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void givenOneInchAndOneYard_WhenCompered_ShouldReturnFalse()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(1.0, UnitOfLength.INCH);
      QuantityMeasurement yard1 = new QuantityMeasurement(1.0, UnitOfLength.YARD);
      Boolean compareCheck = inch1.compare(yard1);
      Assert.assertFalse(compareCheck);
   }

   @Test
   public void given36InchAndOneYard_WhenCompered_ShouldReturnTrue()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(36.0, UnitOfLength.INCH);
      QuantityMeasurement yard1 = new QuantityMeasurement(1.0, UnitOfLength.YARD);
      Boolean compareCheck = inch1.compare(yard1);
      Assert.assertTrue(compareCheck);
   }


   @Test
   public void given3FeetAndOneYard_WhenCompered_ShouldReturnTrue()
   {
      QuantityMeasurement inch1 = new QuantityMeasurement(3.0, UnitOfLength.FEET);
      QuantityMeasurement yard1 = new QuantityMeasurement(1.0, UnitOfLength.YARD);
      Boolean compareCheck = inch1.compare(yard1);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void givenOneFeetAnd3Yard_WhenCompered_ShouldReturnFalse()
   {
      QuantityMeasurement feet1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      QuantityMeasurement yard1 = new QuantityMeasurement(3.0, UnitOfLength.YARD);
      Boolean compareCheck = feet1.compare(yard1);
      Assert.assertFalse(compareCheck);
   }

   @Test
   public void given2InchAnd5CentiMeter_WhenCompered_ShouldReturnTrue()
   {
      QuantityMeasurement inch = new QuantityMeasurement(2.0, UnitOfLength.INCH);
      QuantityMeasurement centiMeter = new QuantityMeasurement(5.0, UnitOfLength.CENTI_METER);
      Boolean compareCheck = inch.compare(centiMeter);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void givenOneGallonAnd3p78Litre_WhenCompered_ShouldReturnTrue()
   {
      QuantityMeasurement gallon = new QuantityMeasurement(1.0, UnitOfVolume.GALLON);
      QuantityMeasurement litre = new QuantityMeasurement(3.78, UnitOfVolume.LITRE);
      Boolean compareCheck = gallon.compare(litre);
      Assert.assertTrue(compareCheck);
   }

   @Test
   public void givenOneLitreAnd1000MilliLitre_WhenCompered_ShouldReturnTrue()
   {
      QuantityMeasurement litre = new QuantityMeasurement(1.0, UnitOfVolume.LITRE);
      QuantityMeasurement milliLitre = new QuantityMeasurement(1000.0, UnitOfVolume.MILLI_LITRE);
      Boolean compareCheck = litre.compare(milliLitre);
      Assert.assertTrue(compareCheck);
   }
}

