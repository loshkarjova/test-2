package shop;

public class Main {
    static String name;
    static int quantity;
    static double price;
    static double sales;
    static int tax;
    static String roundCost;
    static String roundPrice;
    static String roundTax;
    static String productData;
    static String totalCost;

    public static void main(String[] args) {
        getProductA();
    }

    private static void getProductA() {
        name = "Phones";
        quantity = 10;
        price = 1200;
        tax = 5;
        ProductA productA = new ProductA(name, quantity, price, tax, sales);

        sales = productA.calcCost();
        roundCost = Rounder.roundValue(productA.calcCost());
        roundPrice = Rounder.roundValue(price);
        roundTax = Rounder.roundValue(productA.calcTax(sales,tax));
        totalCost = Rounder.roundValue(productA.calcTotalCost());
        productData = "Product: " + name + "" + "\nQuantity: " + quantity + "\nPrice (USD): " + roundPrice +
                      "\nTax (%): " + tax + "\nTax (USD): " + roundTax + "\nCost (USD): " + totalCost;
        showData(productData);
    }

    private static void showData(String prodInfo) {
        System.out.println(prodInfo);
    }
}

