package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int Age;

//    public Person(Pet pet) {
//        this.pet = pet;
//        System.out.println("Person bean is created");
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person : set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person : set surname");
        this.surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        System.out.println("Class Person : set age");
        Age = age;
    }

    public void callYourPet() {
        System.out.println("Hello,my lovely Pet!");
        pet.say();
    }
}
