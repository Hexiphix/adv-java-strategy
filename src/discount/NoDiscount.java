package discount;

public class NoDiscount implements DiscountStyle{
    public double applyDiscount(double billAmount) {
        return billAmount;
    }
}
//