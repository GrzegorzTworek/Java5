package Classes;

public class StringBuild {
    public static void main(String[] args){

        //Inefficient
        String info = "";

        info += "My naem is BOb";
        info += " ";
        info += "I am Builder. ";

        System.out.println(info);

        //More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("Mu name is Roger")
                .append(" ")
                .append("I am a skydiver.");
        System.out.println(s.toString());

        ///Formating
        System.out.print("Here is soem text. \tThat was a tab. \nThat wa a newline");
        System.out.println(" More text.");
///Formating integers
        System.out.printf("total cost %10d; quantity is %d\n", 5, 120);

        for(int i=0; i<20; i++){
            System.out.printf("%2d: %s\n", i,"here is some text") ;
        }
///Formating floating point value
        System.out.printf("Toral value: %.2f\n",5.6897);
        System.out.printf("Toral value: %-6.1f\n",343.56577);
    }
}
