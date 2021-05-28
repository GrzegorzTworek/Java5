package Classes;

class Pig {
    private int id;
    public String name;

    public Pig(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return String.format("%-4d: %s", id , name);
        //return "Hello ";
        /*StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString
        return id + ": "+ name;
         */
    }
}

public class TOStringmethod {
    public static void main(String[] args){
       // Object obj = new Object();
       //obj.hashCode()
        Pig pig1 = new Pig(7, "Freddy");
        Pig pig2 = new Pig(5, "Roger");
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
