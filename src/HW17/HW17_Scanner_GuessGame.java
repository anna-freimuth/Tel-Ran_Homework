package HW17;

import java.util.Random;
import java.util.Scanner;

public class HW17_Scanner_GuessGame {
    public static void main(String[] args) {
        guessNumber(5);
    }
    //Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать.
    // После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
    // В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).

    private static void guessNumber(int guessAttempts) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int computerNumber = min + random.nextInt(20); // in range (1,20) getting random number
        for (int i = 0; i < guessAttempts ; i++) {
            int userGuess;
            System.out.println("Please enter a number:");
            userGuess = input.nextInt();
            if( userGuess == computerNumber){
                System.out.println("You have won. The guess number is matching computer number : " + computerNumber);
                return;
            }
            else if (userGuess < computerNumber){
                System.out.println("Your guess number is too small. Please try again: ");
            }
            else if (userGuess > computerNumber){
                System.out.println("Your guess number is too big. Please try again: ");
            }
        }
        System.out.println("You lost. You ran out of guess attempts.");
    }
}
