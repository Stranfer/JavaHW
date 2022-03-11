public class InformationPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Андрей", "Олегович", "Попов", 19);


        System.out.println("Родился в: " + person1.bornIn(2022 - person1.getAge())+" году");
    }
}
