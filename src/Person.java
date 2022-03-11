public class Person<name, familyName, middleName, age> {

    private static String name;
    private static Integer age;
    private String middleName;
    private String familyName;

    public Person(String name, String middleName, String familyName, Integer age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public static void setName(String name) {
        if (name.length()>=2){
            Person.name = name;
            Person.age = age;
        }
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Integer getAge() {
        return age;
    }
    public int bornIn(double bornIn) {
        return 2022-this.age;
    }

    public static void  printName(){
        System.out.println("Имя: "+ name);

    }

    public static void printAge() {
        System.out.println("Возраст: "+ age);
    }

}