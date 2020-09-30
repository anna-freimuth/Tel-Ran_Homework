package HW17;

import java.util.Scanner;

public class HW17_Scanner {
    public static void main(String[] args) {
        //Напишите программу, которой надо представиться. Данные, которые спрашивает машина: имя,
        // фамилия, пол, возраст, e-mail. Для считывания данных типа String используйте метод next(): input.next()
        questionnaire();
    }

    private static void questionnaire() {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("What is your name? ");
        name = input.next();
        String surname;
        System.out.println("What is your surname?");
        surname = input.next();
        String gender;
        System.out.println("What is your gender?");
        gender = input.next();
        int years;
        System.out.println("How old are you?");
        years = input.nextInt();
        String email;
        System.out.println("What is your E-mail address?");
        email = input.next();
        input.close();
    }
}

