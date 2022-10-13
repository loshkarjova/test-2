package company;

public class CompanyA extends Company {

    public CompanyA(String name, String address, String phone, double income) {
        super(name, address, phone, income);
    }

    @Override
    double calcIncome(double price, int quantity) {
        return price * quantity;
    }

    @Override
    public double calcTax(double income) {
        return income * 12 / 100;
    }

}
