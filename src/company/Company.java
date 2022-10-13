package company;

abstract class Company implements Tax {
    private final String name;
    private final String address;
    private final String phone;
    private final double income;

    public Company(String name, String address, String phone, double income) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.income = income;

    }

    abstract double calcIncome(double price, int quantity);

}
