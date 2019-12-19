public enum UnitOfVolume implements Unit {

    GALLON(1.0),LITER( 0.2645502646);

    public final Double value;

    UnitOfVolume(Double value) {
            this.value=value;
    }

    @Override
    public Double convertValue() {
        return this.value;
    }
}
