package CristianSandu.java3.exercises.polymorpihsm;

public class Message {

    String msg = "Happy New Year!";

    public void printMsg() {
        System.out.println(msg);
    }

}

class TestMessage {
    public static void change(Message msg) {
//        msg = new Message(); // Create a new object
        msg.msg = "Happy Holidays!"; //
    }

    public static void main(String[] args) {
        Message msg = new Message(); // Create a new Object
        msg.printMsg(); // Happy new Year!
        change(msg);
        msg.printMsg(); // Happy new Year!
    }



}

