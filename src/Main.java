import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int curenYar = 2022;
        Human macsim = new Human();
        macsim.name = "Максим";
        macsim.town = "Минск";
        macsim.yearOfBirth = 35;
        macsim.job = "бренд-менеджером";

        Human anna = new Human();
        anna.name = "Аня";
        anna.town = "Москва";
        anna.yearOfBirth = 29;
        anna.job = "методистом образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 28;
        katya.job = " продакт-менеджером";

        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 27;
        artem.job = "директором по развитию бизнеса";


        System.out.println("Привет! Меня зовут " + macsim.name + "  Я из города " + macsim.town + "  Я родился в " + (curenYar - macsim.yearOfBirth) + " году. Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + anna.name + "  Я из города " + anna.town + "  Я родился в " + (curenYar - anna.yearOfBirth) + " году. Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + artem.name + "  Я из города " + artem.town + "  Я родился в " + (curenYar - artem.yearOfBirth) + " году. Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + katya.name + "  Я из города " + katya.town + "  Я родился в " + (curenYar - katya.yearOfBirth) + " году. Будем знакомы! ");
        System.out.println("==============================================================================================================================");

//Задача 2
        System.out.println("Привет! Меня зовут " + macsim.name + " Я из города " + macsim.town + "  Я родился в " + (curenYar - macsim.yearOfBirth) + "  Я работаю на должности" + macsim.job + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + " Я из города " + anna.town + "   Я родился в " + (curenYar - anna.yearOfBirth) + "  Я работаю на должности" + anna.job + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + " Я из города " + artem.town + "  Я родился в " + (curenYar - artem.yearOfBirth) + "  Я работаю на должности" + artem.job + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + " Я из города " + katya.town + "  Я родился в " + (curenYar - katya.yearOfBirth) + "  Я работаю на должности" + katya.job + " году. Будем знакомы!");
        System.out.println("==============================================================================================================================");

    }
}



