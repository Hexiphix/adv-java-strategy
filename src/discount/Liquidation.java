package discount;

public class Liquidation implements DiscountStyle{
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}