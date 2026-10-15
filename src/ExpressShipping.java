public class ExpressShipping implements ShippingStrategy {

    private static final double BASE_FEE = 20.0;
    private static final double FEE_PER_KG = 5.0;

    @Override
    public double calculate(double weight) {
        return BASE_FEE + weight * FEE_PER_KG;
    }
}
