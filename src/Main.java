public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo();


        Person person2 = new Person("MIMI", 20, 2005.8);
        person2.displayInfo();

        Person person3 = new Person("Sarah", 30);
        person3.displayInfo();
    }
}