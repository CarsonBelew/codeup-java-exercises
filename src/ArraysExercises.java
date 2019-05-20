import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Chad");
        people[1] = new Person("Clint");
        people[2] = new Person("Carson");

        for (Person person : people){
            System.out.println(people[1]);
        }
    }
}
