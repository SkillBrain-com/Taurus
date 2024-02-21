package kateaManoila.Java3.Exzercses.Polymorphism;

public class Message {
    String msg ="Un an nou fericit!";
    public void printMsg(){
        System.out.println(msg);
    }
}
class TestMessage{
    public static void change(Message m){
      //  m =new Message();
        m.msg ="Sarbatori fericite!";

    }

    public static void main(String[] args) {
        Message msg = new Message();//Creem un nou obect;
        msg.printMsg();//Un an nou fericit!
        change(msg);
        msg.printMsg();//Un an nou fericit!

    }
}
