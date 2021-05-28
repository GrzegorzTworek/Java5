package AccesWorld;

public class Oak extends Plant {
    public Oak(){
        // wont work type is private
        //type = "tree";
        // This works
        this.size = "large";

        //no acces specifier; works because Oak and Plant in same package
        this.height = 10;
    }
}
