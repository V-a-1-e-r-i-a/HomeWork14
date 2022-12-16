public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        if (color.isEmpty() && color == null) {
            color = "Белый";
        }
        this.color = color;
        if (productionYear <= 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;
        if (productionCountry == null || productionCountry.isEmpty()) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ";" +
                "\n Модель: " + model + ";" +
                "\n Объем двигателя в литрах: " + engineVolume + ";" +
                "\n Цвет кузова: " + color + ";" +
                "\n Год производства: " + productionYear + ";" +
                "\n Страна сборки: " + productionCountry + ";";
    }
}
