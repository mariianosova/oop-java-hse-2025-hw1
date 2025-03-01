public class Sugar {
    private String sugarLevel;
    private double sugarPrice;

    public Sugar(String sugarLevel) {
        this.sugarLevel = sugarLevel;
        this.sugarPrice = determinePrice(sugarLevel);
    }

    private double determinePrice(String sugarLevel) {
        switch (sugarLevel) {
            case "Без сахара":
                return 0.0;
            case "Мало сахара":
                return 5.0;
            case "Среднее количество сахара":
                return 10.0;
            case "Много сахара":
                return 15.0;
            default:
                return 0.0;
        }
    }

    public String getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(String sugarLevel) {
        this.sugarLevel = sugarLevel;
        this.sugarPrice = determinePrice(sugarLevel);
    }

    public double getSugarPrice() {
        return sugarPrice;
    }

    public void setSugarPrice(double sugarPrice) {
        this.sugarPrice = sugarPrice;
    }

    public String getSugarDescription() {
        return "Уровень сахара: " + sugarLevel;
    }

    public String toString() {
        return "Уровень сахара: " + sugarLevel + " (+" + sugarPrice + " руб.)";
    }
}
