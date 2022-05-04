package discount;

public class Discount implements DiscountStyle{
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}