package Classes;

class Osoba {
    String name;
    int age;

    void speak(){
        System.out.println("My name is: "+ name);
    }
    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;

        //System.out.println(yearsLeft);
        return yearsLeft;
    }
        int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}
public class Getters {
    public static void main(String[] args){
Osoba person1 = new Osoba();
person1.name = "Joe";
person1.age =25;
person1.speak();

int years = person1.calculateYearsToRetirement();
System.out.println("Years till retiremnets " + years);

int age = person1.getAge();
String name = person1.getName();

System.out.println("Name is " + name);
System.out.println("Age is " + age);
    }

}
