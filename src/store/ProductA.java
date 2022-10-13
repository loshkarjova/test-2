package store;

public class ProductA extends Product implements Tax{
    private final int quantity;
    private final double price;
    private final double tax;
    private double sales;

    public ProductA(String name, int quantity, double price, double tax, double sales) {
        super(name);
        this.quantity = quantity;
        this.price = price;
        this.tax = tax;
        this.sales = sales;
    }


    @Override
    public double calcCost() {
        sales = quantity * price;

        return sales;

    }

    @Override
    public double calcTax(double sales, double tax) {
        return sales * (tax / 100);
    }

    @Override
    double calcTotalCost() {
        return  sales  + (sales * (tax / 100));
    }
}
