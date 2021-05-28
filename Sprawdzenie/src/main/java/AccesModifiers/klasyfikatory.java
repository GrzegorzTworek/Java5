package AccesModifiers;

import AccesWorld.Plant;
import Dziedziczenie.Machine;
/*
private --- only within same class
public --- from anywhere
protected --- same class,subclass, same package
no modifier --- only in the same package
 */

public class klasyfikatory {
    public static void main(String[] args){

        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(plant.ID);

        //dont work type is private
        //System.out.println(plant.type);

        //size is protected and klasa klasyfikatory nie nie w tej samej paczce
        //wont work
        //System.out.println(plant.size);

        //wont work; bo klasa klasyfikatory and Plant in different packages, height has package-level visilibity
        //System.out.println(plant.height);

        //Dodatkowy do spraedzenia z innej paczki
        //System.out.println(Machine.name);


    }
}
