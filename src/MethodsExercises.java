import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static void main(String[] args) {
//        addition(5,5);
//        subtraction(15,5);
//        multiplication(5,5);
//        division(10,5);
//        modulus(50,2);
        getInteger(1,10);
        factorial();
        diceRoll();


    }
//    1
    public static void addition(int a, int b){
        System.out.println(a + b);
    }
    public static void subtraction(int a, int b){
        System.out.println(a - b);
    }
    public static void multiplication(int a, int b){
        System.out.println(a * b);
    }
    public static void division(int a, int b){
        System.out.println(a / b);
    }
    public static void modulus(int a, int b){
        System.out.println(a % b);
    }
//    2
    public static int getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput >= min && userInput <= max){
            System.out.println("Valid");
        } else{
            System.out.println("Invalid");
        }
        return 0;
    }
//    3
    public static void factorial(){
        int number = getInteger(1,10);
        String output = "";
        int total = 1;

        for (int i = 1; i <= number; i++){
            total *= i;
            output +=  i + "! = " + (total) + "\n";
            }
        System.out.println(output);
    }

//    4
    public static String diceRoll(){
        char diceRoll;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides are on the pair of dice?");
        int sidesNumber = scanner.nextInt();
        System.out.println("Cool, there are " + sidesNumber + " sides to your dice!");
        System.out.println();
        System.out.println("Let's get to rollin!!");
        System.out.println("Enter anything to roll the dice");
        diceRoll = scanner.next().charAt(0);
        do {
            System.out.println("Rolling the dice...");
            double randNumber1 = Math.random() * sidesNumber + 1;
            double randNumber2 = Math.random() * sidesNumber + 1;
            long randNumRounded1 = Math.round(Math.floor(randNumber1));
            long randNumRounded2 = Math.round(Math.floor(randNumber2));
            System.out.printf("The dice numbers are " + randNumRounded1 + " and " + randNumRounded2 + "!" );
        }while(diceRoll == 'q');
        System.out.println();
        return "great job";
    }


}

