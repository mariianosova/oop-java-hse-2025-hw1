/**
 * Класс Sugar
 *
 * Поля (примерная идея):
 *   - private String sugarLevel; // Например: "Без сахара", "Мало сахара", "Много сахара"
 *   - private double sugarPrice; // надбавка к цене (может быть 0 для "Без сахара", 10.0 для "Много" и т.д.)
 *
 * Геттеры/сеттеры:
 *   - getSugarLevel(), setSugarLevel(...)
 *   - getSugarPrice(), setSugarPrice(...)
 *
 * Методы (примерные идеи):
 *   - getSugarDescription(): String
 *       (может возвращать что-то вроде: "Добавлен сахар: <уровень>")
 */
public class Sugar {
    private String sugarLevel;
    private double sugarPrice;

    public Sugar(String sugarLevel) {
        this.sugarLevel = sugarLevel;
        this.sugarPrice = determinePrice(sugarLevel);
    }

    private double determinePrice(String sugarLevel) {
        if (sugarLevel.equals("Без сахара")) {
            return 0.0;
        } else if (sugarLevel.equals("Мало сахара")) {
            return 5.0;
        } else if (sugarLevel.equals("Среднее количество сахара")) {
            return 10.0;
        } else if (sugarLevel.equals("Много сахара")) {
            return 15.0;
        } else {
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
