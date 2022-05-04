package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private DiscountStyle discountType;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        setDiscountType(discountType);
    }

    public double getBillAmount() {
        return discountType.applyDiscount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDiscountType() {
        return discountType.getClass().getSimpleName();
    }

    public void setDiscountType(char discountType) {
        switch (discountType) {
            case 'S':
            case 's':
                this.discountType = new Sale();
                break;
            case 'D':
            case 'd':
                this.discountType = new Discount();
                break;
            case 'L':
            case 'l':
                this.discountType = new Liquidation();
                break;
            default:
                this.discountType = new NoDiscount();
        }
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + getDiscountType()
                + '}';
    }
}
