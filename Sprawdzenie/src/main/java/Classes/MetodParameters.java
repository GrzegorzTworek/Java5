package Classes;

class Robot {
    public void speak(String k){
        System.out.println("Hello " + k);
    }
    public void jump(int height){
        System.out.println("Jumping "+ height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " metres in direction "+ direction);

    }
}

public class MetodParameters {
    public static void main(String[] args){
        Robot sam = new Robot();
        sam.speak("Hi I am Sam");
        sam.jump(7);
        sam.move("West", 12.2);

        String greeting ="Hello there";
        sam.speak(greeting);
        int value = 14;
        sam.jump(value);

    }
}
