package company;

import java.util.Scanner;

public class Info {

    static String name;
    static String address;
    static String phone;
    static double income;
    static double tax;
    static int quantity;
    static double price;
    static String roundIncome;
    static String roundTax;
    static String companyInfo;


    public static void getInfoCompanyA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write company's name: ");
        name = scanner.nextLine().toUpperCase();
        System.out.println("Write company's address: ");
        address = scanner.nextLine().toUpperCase();
        System.out.println("Write company's phone: ");
        phone = scanner.nextLine();
        System.out.println("Write quantity of product: ");
        quantity = scanner.nextInt();
        System.out.println("Write price of product: ");
        price = scanner.nextDouble();
        CompanyA companyA = new CompanyA(name, address, phone, income);
        income = companyA.calcIncome(price, quantity);
        tax = companyA.calcTax(income);
        roundIncome = Rounder.roundValue(income);
        roundTax = Rounder.roundValue(tax);
        companyInfo = "\nCompany's name: " + name +
                      "\nCompany's address: " + address +
                      "\nCompany's phone: " + phone +
                      "\nQuantity of product: " + quantity +
                      "\nPrice (USD): " + price +
                      "\nIncome (USD): " + roundIncome +
                      "\nTax (USD): " + roundTax;

    }
}
