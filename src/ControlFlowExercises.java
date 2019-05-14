import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number to calculate what it is squared and cubed");
        int userInput = scan.nextInt();
        for (int i = 0; i <= userInput; i++){
            if (i == 0){
                System.out.printf("|%-8s|%-6s|%-8s|\n|--------|------|--------|\n","Number","Squared","Cubed");
            }else if (i == userInput){
                System.out.printf("|%-8s|%-6s|%-8s|\n|________|______|________|\n",i,i*i,i*i*i);
            }else{
                System.out.printf("|%-8s|%-6s|%-8s|\n",i,i*i,i*i*i);}
        }
    }
}