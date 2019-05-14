import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number to between 1 and 100");
        int userInput = scan.nextInt();
        if ((userInput >=88)){
            System.out.println("Congrats. You have an A in the class!");
        }
        else  if (userInput >=80){
            System.out.println("Congrats. You have a B in the class!");
        }
        else if (userInput >= 67){
            System.out.println("Well, you have a C...");
        }
        else if (userInput >= 60){
            System.out.println("Well, you have a D and it is starting to get ridiculous..");
        }
        else {
            System.out.println("Welp you Failed. Bye!");
        }
    }
}