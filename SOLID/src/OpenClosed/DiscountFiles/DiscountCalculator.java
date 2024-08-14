package OCP.DiscountFiles;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    private Map<String, DiscountStrategy> strategies = new HashMap<>();

    public DiscountCalculator() {
        strategies.put("STUDENT", new StudentDiscount());
        strategies.put("SENIOR", new SeniorDiscount());
    }

    public double calculateDiscount(String type, double price) {
        DiscountStrategy strategy = strategies.get(type);
        if (strategy != null) {
            return strategy.applyDiscount(price);
        }
        return price;
    }
}
