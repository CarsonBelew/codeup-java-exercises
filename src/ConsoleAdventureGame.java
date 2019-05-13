import java.util.Scanner;
public class ConsoleAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello hero/heroine, what is thy name?");
        String heroName = scanner.next();
        System.out.println("Welcome " + heroName + "." + " Are you ready to begin your quest?");
        String startAnswer = scanner.next();
    }
}