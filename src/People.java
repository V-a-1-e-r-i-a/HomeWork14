public class People {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public People(int yearOfBirth, String name, String town, String job) {
         if (yearOfBirth < 0) {
             this.yearOfBirth = 0;
         }
        if (name == null || name.isEmpty()) {
            name = "*Информация не указана*";
        }
        this.name = name;
        if (town == null || town.isEmpty()) {
            town = "*Информация не указана*";
        }
        this.town = town;
        if (job == null || job.isEmpty()) {
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
