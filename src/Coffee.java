public class Coffee {
    private String name;
    private double basePrice;
    private double finalPrice;

    public Coffee(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.finalPrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        this.finalPrice = basePrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void calculatePriceWithSugar(Sugar sugar) {
        this.finalPrice = basePrice + sugar.getSugarPrice();
    }

    public String toString() {
        return "Кофе: " + name + " (Цена: " + finalPrice + " руб.)";
    }
}

