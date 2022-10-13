package store;

public class Main {
    static String name;
    static int quantity;
    static double price;
    static int tax;
    static double sales;
    static String roundCost;
    static String roundPrice;
    static String roundTax;
    static String productData;
    static String totalCost;

    public static void main(String[] args) {
        getProductA();
        getProductB();

    }

    private static void getProductA() {
        name = "Laptop";
        quantity = 10;
        price = 1200;
        tax = 5;
        ProductA productA = new ProductA(name, quantity, price, tax, sales);
        sales = productA.calcCost();
        roundCost = Rounder.roundValue(productA.calcCost());
        roundPrice = Rounder.roundValue(price);
        roundTax = Rounder.roundValue(productA.calcTax(sales, tax));
        totalCost = Rounder.roundValue(productA.calcTotalCost());
        productData = "Product: " + name + "" + "\nQuantity: " + quantity + "\nPrice (USD): " + roundPrice
                      + "\nTax (USD): " + roundTax + "\nCost (USD): " + totalCost;
        showData(productData);
    }

    private static void getProductB() {
        name = "Phones";
        quantity = 5;
        price = 600;
        ProductB productB = new ProductB(name, quantity, price, sales);
        sales = productB.calcCost();
        roundCost = Rounder.roundValue(productB.calcCost());
        roundPrice = Rounder.roundValue(price);
        roundTax = Rounder.roundValue(productB.calcTax(sales,tax));
        totalCost = Rounder.roundValue(productB.calcTotalCost());
        productData = "\nProduct: " + name + "" + "\nQuantity: " + quantity + "\nPrice (USD): " + roundPrice +
                      "\nTax (USD): " + roundTax + "\nCost (USD): " + totalCost;
        showData(productData);
    }

    private static void showData(String prodInfo) {
        System.out.println(prodInfo);

    }
}

