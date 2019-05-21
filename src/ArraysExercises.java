import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Chad"), new Person("Clint"), new Person("Carson")};

        for (Person person : people){
            System.out.println(person.getName());
        }

        for (int i = 0; i < people.length; i++){
            System.err.println(people[i].getName());
        }
    }
}
