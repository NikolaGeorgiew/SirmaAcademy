package OpenClosed.DiscountFiles;

public class SeniorDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price * 0.2;
    }
}
