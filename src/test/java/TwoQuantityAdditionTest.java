import org.junit.Assert;
import org.junit.Test;

public class TwoQuantityAdditionTest {
    @Test
    public void given2InchAnd5CentiMeter_WhenCompered_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(2.0, UnitOfLength.INCH);
        QuantityMeasurement centiMeter = new QuantityMeasurement(5.0, UnitOfLength.CENTI_METER);
        Boolean compareCheck = inch.compare(centiMeter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenCompered_ShouldReturn4Inch() {
        QuantityMeasurement inch2 = new QuantityMeasurement(2.0, UnitOfLength.INCH);
        QuantityMeasurement inch1 = new QuantityMeasurement(2.0, UnitOfLength.INCH);
        Double additionOfInchAndInch = inch2.additionOfTwoUnits(inch1);
        Assert.assertEquals(4, additionOfInchAndInch, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompered_ShouldReturn24Inch() {
        QuantityMeasurement oneFeet1 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
        QuantityMeasurement oneFeet2 = new QuantityMeasurement(1.0, UnitOfLength.FEET);
        Double additionOfInchAndInch = oneFeet2.additionOfTwoUnits(oneFeet1);
        Assert.assertEquals(24, additionOfInchAndInch, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompered_ShouldReturn14Inch() {
        QuantityMeasurement oneFeet = new QuantityMeasurement(1.0, UnitOfLength.FEET);
        QuantityMeasurement oneInch = new QuantityMeasurement(2.0, UnitOfLength.INCH);
        Double additionOfInchAndInch = oneFeet.additionOfTwoUnits(oneInch);
        Assert.assertEquals(14, additionOfInchAndInch, 0.0);
    }

    @Test
    public void given2InchAnd2p5CentiMeter_WhenCompered_ShouldReturn3Inch() {
        QuantityMeasurement twoInch = new QuantityMeasurement(2.0, UnitOfLength.INCH);
        QuantityMeasurement twoPointFiveCM = new QuantityMeasurement(2.5, UnitOfLength.CENTI_METER);
        Double additionOfInchAndInch = twoPointFiveCM.additionOfTwoUnits(twoInch);
        Assert.assertEquals(3, additionOfInchAndInch, 0.0);
    }

    @Test
    public void gien2InchAnd2p5CentiMeter_WhenCompered_ShouldReturn3Inch() {
        QuantityMeasurement twoInch = new QuantityMeasurement(1.0, UnitOfVolume.GALLON);
        QuantityMeasurement twoPointFiveCM = new QuantityMeasurement(3.78, UnitOfVolume.LITER);
        Double additionOfInchAndInch = twoPointFiveCM.additionOfTwoUnits(twoInch);
        Assert.assertEquals(3, additionOfInchAndInch, 0.0);
    }
}
