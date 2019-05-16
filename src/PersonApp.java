public class PersonApp {
    public static void main(String[] args) {
        Person car = new Person();
        car.firstName = "Carson";
        car.lastName = "Belew";
        System.out.println(car.sayHello());

        Person ana = new Person();
        ana.firstName = "Ana";
        ana.lastName = "Perez";
        System.out.println(ana.sayHello());
    }
}
