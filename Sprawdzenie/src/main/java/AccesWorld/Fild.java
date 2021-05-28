package AccesWorld;

public class Fild {
    private Plant plant = new Plant();

    public Fild() {
        // size is protected and field is in the same package
        System.out.println(plant.size);
    }
}
