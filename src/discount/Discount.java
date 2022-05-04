package discount;

public class Discount implements DiscountStyle{
    public double applyDiscount(double billAmount) {
        double discountedBill;
        discountedBill = billAmount - (billAmount * 0.5);
        return discountedBill;
    }
}