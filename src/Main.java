import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale ptBR = Locale.forLanguageTag("pt-BR");
        double weight = 3.0;

        ShippingCalculator calculator = new ShippingCalculator(new StandardShipping());
        System.out.println(String.format(ptBR, "Standard: R$ %.2f", calculator.calculate(weight)));

        calculator.setStrategy(new ExpressShipping());
        System.out.println(String.format(ptBR, "Express: R$ %.2f", calculator.calculate(weight)));

        calculator.setStrategy(new StorePickup());
        System.out.println(String.format(ptBR, "Pickup: R$ %.2f", calculator.calculate(weight)));
    }
}
