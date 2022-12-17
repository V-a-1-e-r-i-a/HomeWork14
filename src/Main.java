public class Main{
    public static void main(String[] args) {

        System.out.println("Задание 1");
        People max = new People(1987,"Максим","Минкс","бренд-менеджером");
        People anya = new People(1993, "Аня", "Москва","методист образовательных программ");
        People kate = new People(1994,"Екатерина","Калининград","продакт-менеджером");
        People artem = new People(1995,"Артем","Москва","директор по развитию бизнеса");

        System.out.println(max);
        System.out.println(anya);
        System.out.println(kate);
        System.out.println(artem);

        System.out.println("Задание 3");
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmvZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmvZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}