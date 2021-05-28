package Abstrakcyjne;

public class Student extends Person {

    private String major;
    Student(String name, String major){

        super(name);
        this.major= major;
    }

    public String getDescription(){ return "a student major in " + major;}
}
