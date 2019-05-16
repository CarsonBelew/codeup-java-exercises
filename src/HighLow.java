import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rnd = (int) (Math.random() * 100) + 1;
        game(rnd);
    }
    public static void game(int rnd){
        do {
            int guess = getInteger(1, 100);
            if (guess > rnd){
                System.out.println("GO LOWER");
            }else if (guess < rnd){
                System.out.println("GO HIGHER");
            }else {
                System.out.println("WINNER WINNER");
                break;
            }
        }while (true);
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput >= min && userInput <= max){
            System.out.println("Valid");
        } else{
            System.out.println("Invalid");
        }
        return getInteger(min, max);
    }
}
