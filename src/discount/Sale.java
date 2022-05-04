package discount;

public class Sale implements DiscountStyle{
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}