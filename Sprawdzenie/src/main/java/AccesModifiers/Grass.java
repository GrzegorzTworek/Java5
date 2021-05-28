package AccesModifiers;

import AccesWorld.Plant;

public class Grass extends Plant {
    public Grass(){

        //wont work grass not in the same package even though its a subclass
        //System.out.println(this.height);
    }
}
