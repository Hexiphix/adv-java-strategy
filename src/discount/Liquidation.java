package discount;

public class Liquidation implements DiscountStyle{
    public double applyDiscount(double billAmount) {
        double discountedBill;
        discountedBill = billAmount - (billAmount * 0.75);
        return discountedBill;
    }
}