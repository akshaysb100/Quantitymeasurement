
public class QuantityMeasurement {
    private double value;
    private final Unit unit;

    public QuantityMeasurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(QuantityMeasurement that) {

        Double firstValue = this.unit.convertValue() * this.value;
        Double secondValue = that.unit.convertValue() * that.value;
        return (Double.compare(firstValue, secondValue) == 0);
    }

    public Double additionOfTwoUnits(QuantityMeasurement that) {
        Double firstValue = this.unit.convertValue() * this.value;
        Double secondValue = that.unit.convertValue() * that.value;
        return (firstValue + secondValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.value, value) == 0 &&
                unit == quantityMeasurement.unit;
    }
}
