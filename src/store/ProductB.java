package store;

public class ProductB extends Product implements Tax {
    private final int quantity;
    private final double price;
    private double tax;
    private double sales;


    public ProductB(String name, int quantity, double price, double sales) {
        super(name);
        this.quantity = quantity;
        this.price = price;
        this.sales = sales;
    }


    @Override
    double calcCost() {
        sales = quantity * price;
        return sales;
    }


    @Override
    public double calcTax(double sales, double tax) {
        if (price <= 500) {
            this.tax = 5;
        } else if (price > 500 && price <=1000){
            this.tax = 10;
        }else {
            this.tax = 15;
        }
            return sales * (tax / 100);
    }
    @Override
    double calcTotalCost() {
        return sales + (sales * (tax / 100));
    }
}



