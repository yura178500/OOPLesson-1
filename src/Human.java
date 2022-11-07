public class Human {
    public String name;
    int yearOfBirth;
    String town;

    String job;



    public String toString() {
        return "Привет! Меня зовут" + name + "Я из города " + town + " Я родился в " + yearOfBirth + " году. Будем знакомы!";
    }


    void getYearOfBirth() {
        this.yearOfBirth = yearOfBirth;
    }

    void getName() {
        this.name = name;
    }

    void getTown() {
        this.town = town;
    }

    void getJob() {
        this.job = job;
    }
}


