package Abstrakcyjne;

public class PersonTest {
    public static void main (String[] args){

        var people = new Person[2];

        people[0]=new Employee("Harry Poteer", 50000, 1979,3,1);
        people[1]=new Student( "Johan Smith", "computer science");



        Employee x = (Employee) people[0] ;
        x.raiseSalary(10);//.getName();     //raiseSalary(10);



//for (Person p : people){
  // p.raiseSalary(10);
//}
        //people[0] = new String k;
        for(Person p : people){
            System.out.println(p.getName() + ", " +p.getDescription());}
        //people[0].raiseSalary(5);


    }
}
