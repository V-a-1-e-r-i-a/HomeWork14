public class People {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public People(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth >= 1930) {
            this.yearOfBirth = yearOfBirth;
        } else if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else if (yearOfBirth >= 2022) {
            System.out.println("*Не корректно указанные данные*");
        } else {
            this.yearOfBirth = 0;
        }
        if (name == null) {
            name = "*Информация не указана*";
        }
        this.name = name;
        if (town == null) {
            town = "*Информация не указана*";
        }
        this.town = town;
        if (job == null) {
            job = "*Информация не указана*";
        }
        this.job = job;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ", я из города " + town +
                ", я родился в " + yearOfBirth + " году." +
                " Я работаю на должности " + job + ". Будем знакомы!";
    }
}
