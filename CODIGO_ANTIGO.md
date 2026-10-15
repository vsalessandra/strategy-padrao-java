## ShippingCalculator.java
```java
public class ShippingCalculator {

    public double calculate(String deliveryType, double weight) {
        if ("STANDARD".equals(deliveryType)) {
            return 10.0 + weight * 2.0;
        } else if ("EXPRESS".equals(deliveryType)) {
            return 20.0 + weight * 5.0;
        } else if ("PICKUP".equals(deliveryType)) {
            return 0.0;
        }

        throw new IllegalArgumentException("Unknown delivery type");
    }
}
```

## Main.java
```java
public class Main {

    public static void main(String[] args) {

        ShippingCalculator calculator = new ShippingCalculator();

        System.out.println("Standard: R$ " + calculator.calculate("STANDARD", 3.0));
        System.out.println("Express: R$ " + calculator.calculate("EXPRESS", 3.0));
        System.out.println("Pickup: R$ " + calculator.calculate("PICKUP", 3.0));
    }
}
```
