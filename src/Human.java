public class Human {
    public String name;
    public String getTown;
    public int getYearOfBirth;
    private int yearOfBirth;
    private String town;
    public String job;

        public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setTown(String town) {
        this.town = town;
    }
    public int getYearOfBirth() {
        this.yearOfBirth = yearOfBirth;

        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth
            ;
        }
        return yearOfBirth;
    }
    public String getTown() {
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;

        }

        return town;
    }
            public String toString() {
            return  "Привет! Меня зовут " + name +
                    " Я из города " + getTown() +
                    "  Я родился в " + getYearOfBirth() +
                    "  Я работаю на должности" + job + " году. Будем знакомы!";
    }
}

