package Abstrakcyjne;

import java.time.LocalDate;

public class Employee extends Person {

    public double salary;
    public LocalDate hireDay;

            Employee(String name, double salary, int year, int month, int day){

        super(name);
        this.salary = salary;
        hireDay=LocalDate.of(year,month,day);

            }
            public double getSalary(){ return salary; }

            public LocalDate getHireDay(){ return hireDay; }

            public String getDescription(){return String.format("an employee with a salary of $%.2f", salary);

            }
            public void raiseSalary(double byPercent){
                double raise = salary * byPercent / 100;
                salary += raise;
                //return salary;
                //salary =salary+ salary * byPercent/100;
                //System.out.print("Podwyższona pensja wynosi " + salary);
            }

}
