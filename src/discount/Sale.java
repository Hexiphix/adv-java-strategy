package discount;

public class Sale implements DiscountStyle{
    public double applyDiscount(double billAmount) {
        double discountedBill;
        discountedBill = billAmount - (billAmount * 0.1);
        return discountedBill;
    }
}
