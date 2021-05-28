package Classes;

class Person{
    //Instance variables (data or "state")
String name;
int age;
    //Classes can contain

    //1.Data
    //2.Subroutines (methods)
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " and I am " + age + " years old ");
        }
    }
    void sayHello(){
        System.out.println("Hello there");
    }
}

public class ClassesObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Joe Biden";
        person1.age = 37;
        person1.speak();
        person1.sayHello();


        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        System.out.println(person1.name);
        person2.sayHello();
    }
}

