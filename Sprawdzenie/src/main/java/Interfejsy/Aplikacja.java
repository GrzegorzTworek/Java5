package Interfejsy;

public class Aplikacja {
    public static void main(String[] args){
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person ("Bob");
        person1.greet();
person1.showInfo();
System.out.println();
        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        outputinfo(mach1);
        outputinfo(person1);
    }
    private static void outputinfo(Info info) {
        info.showInfo();
    }
}
