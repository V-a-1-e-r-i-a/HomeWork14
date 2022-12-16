public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Car ladaGranta = new Car(null, "Granta", 1.7, "желтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", null, 3.0, "черный", 2020, "Германия");
        Car bmvZ8 = new Car("BMW", "Z8", -2.7, "черный", 2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, null, 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 13, "Южная Корея");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmvZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}