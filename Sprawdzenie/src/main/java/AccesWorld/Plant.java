package AccesWorld;

// ta klasa something działa tylko wewnątrz paczki
class Something{

}

public class Plant {
    //bad practice
    public String name;

    //Acceptable practice
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant(){
        this.name = "Fredy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}
