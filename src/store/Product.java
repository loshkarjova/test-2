package store;

abstract class Product {
    private String name;

    public String getName() {
        return name;
    }

    public Product(String name) {
        this.name = name;
    }
    abstract double calcCost();

    double calcTotalCost(){
        return 0;
    }

}
