import org.junit.Assert;
import org.junit.Test;

public class TwoQuantityAdditionTest
{

   @Test
   public void given2InchAnd2Inch_WhenAdd_ShouldReturn4Inch()
   {
      QuantityMeasurement inch2 = new QuantityMeasurement(2.0, UnitOfLength.INCH);
      QuantityMeasurement inch1 = new QuantityMeasurement(2.0, UnitOfLength.INCH);
      Double additionOfInchAndInch = inch2.additionOfTwoUnits(inch1);
      Assert.assertEquals(4, additionOfInchAndInch, 0.0);
   }

   @Test
   public void given1FeetAnd1Feet_WhenAdd_ShouldReturn24Inch()
   {
      QuantityMeasurement oneFeet1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      QuantityMeasurement oneFeet2 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      Double additionOfInchAndInch = oneFeet2.additionOfTwoUnits(oneFeet1);
      Assert.assertEquals(24, additionOfInchAndInch, 0.0);
   }

   @Test
   public void given1FeetAnd1Feet_WhenAdd_ShouldReturn14Inch()
   {
      QuantityMeasurement oneFeet = new QuantityMeasurement(1.0, UnitOfLength.FEET);
      QuantityMeasurement oneInch = new QuantityMeasurement(2.0, UnitOfLength.INCH);
      Double additionOfInchAndInch = oneFeet.additionOfTwoUnits(oneInch);
      Assert.assertEquals(14, additionOfInchAndInch, 0.0);
   }

   @Test
   public void given2InchAnd2p5CentiMeter_WhenAdd_ShouldReturn3Inch()
   {
      QuantityMeasurement twoInch = new QuantityMeasurement(2.0, UnitOfLength.INCH);
      QuantityMeasurement twoPointFiveCM = new QuantityMeasurement(2.5, UnitOfLength.CENTI_METER);
      Double additionOfInchAndInch = twoPointFiveCM.additionOfTwoUnits(twoInch);
      Assert.assertEquals(3, additionOfInchAndInch, 0.0);
   }

   @Test
   public void givenOneGallonAnd3p78Litre_WhenAdd_ShouldReturn7p57Litre()
   {
      QuantityMeasurement twoInch = new QuantityMeasurement(1.0, UnitOfVolume.GALLON);
      QuantityMeasurement twoPointFiveCM = new QuantityMeasurement(3.78, UnitOfVolume.LITRE);
      Double additionOfInchAndInch = twoPointFiveCM.additionOfTwoUnits(twoInch);
      Assert.assertEquals(7.57, additionOfInchAndInch, 0.1);
   }

    @Test
    public void givenOneThousandMilliLitreAndOneLitre_WhenAdd_ShouldReturn2Litre()
    {
        QuantityMeasurement twoInch = new QuantityMeasurement(1000.0, UnitOfVolume.MILLI_LITRE);
        QuantityMeasurement twoPointFiveCM = new QuantityMeasurement(1.0, UnitOfVolume.LITRE);
        Double additionOfInchAndInch = twoPointFiveCM.additionOfTwoUnits(twoInch);
        Assert.assertEquals(2.0, additionOfInchAndInch, 0.1);
    }
}
