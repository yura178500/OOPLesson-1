import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int curenYar = 2022;
        Human macsim = new Human();
        macsim.name = "Максим";
        macsim.getTown = "Минск";
        macsim.getYearOfBirth = 35;
        macsim.job = "бренд-менеджером";
        Human anna = new Human();
        anna.name = "Аня";
        anna.getTown = "Москва";
        anna.getYearOfBirth = 29;
        anna.job = "методистом образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.getTown = "Калининград";
        katya.getYearOfBirth = 28;
        katya.job = " продакт-менеджером";

        Human artem = new Human();
        artem.name = "Артем";
        artem.getTown = "Москва";
        artem.getYearOfBirth = 27;
        artem.job = "директором по развитию бизнеса";

        Human vladimir = new Human();
        vladimir.name = "Владимир";
        vladimir.getTown = "Казань";
        vladimir.getYearOfBirth = 21;
        vladimir.job = "безработный";


        System.out.println("Привет! Меня зовут " + macsim.name + "  Я из города " + macsim.getTown + "  Я родился в " + (curenYar - macsim.getYearOfBirth) + " году. Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + anna.name + "  Я из города " + anna.getTown + "  Я родился в " + (curenYar - anna.getYearOfBirth) + " году. Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + artem.name + "  Я из города " + artem.getTown + "  Я родился в " + (curenYar - artem.getYearOfBirth) + " году. Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + katya.name + "  Я из города " + katya.getTown + "  Я родился в " + (curenYar - katya.getYearOfBirth) + " году. Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + vladimir.name + "  Я из города " + vladimir.getTown + "  Я родился в " + (curenYar - vladimir.getYearOfBirth) + " году. Будем знакомы! ");
        System.out.println("==============================================================================================================================");


        System.out.println("Привет! Меня зовут " + macsim.name + " Я из города " + macsim.getTown + "  Я родился в " + (curenYar - macsim.getYearOfBirth) + "  Я работаю на должности" + macsim.job + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + " Я из города " + anna.getTown + "   Я родился в " + (curenYar - anna.getYearOfBirth) + "  Я работаю на должности" + anna.job + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + " Я из города " + artem.getTown + "  Я родился в " + (curenYar - artem.getYearOfBirth) + "  Я работаю на должности" + artem.job + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + " Я из города " + katya.getTown + "  Я родился в " + (curenYar - katya.getYearOfBirth) + "  Я работаю на должности" + katya.job + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + vladimir.name + " Я из города " + vladimir.getTown + "  Я родился в " + (curenYar - vladimir.getYearOfBirth) + "  Я работаю на должности" + vladimir.job + " году. Будем знакомы!");
        System.out.println("==============================================================================================================================");

    }
}



