package kateaManoila.Java3.Exzercses.Polymorphism;

public class ImmutableExamples {

    public static void main(String[] args) {
        //immutable-nu paote fi modificata ;
//        String examples = "This String immutable";
//        String examplesToLowerCase = examples.toLowerCase();
//        String examplesToUpperCase = examples.toUpperCase();
//        String examplesSubstring = examples.substring(3);
//        System.out.println(examples);
//        System.out.println(examplesToLowerCase);
//        System.out.println(examplesToUpperCase);
//        System.out.println(examplesSubstring);
        String example = "Example";
        String anotherExample = "Example";
        String anotherOtherExample = "Example";

        System.out.println(System.identityHashCode(example));
        System.out.println(System.identityHashCode(anotherExample));
        System.out.println(System.identityHashCode(anotherOtherExample));



        System.out.println(example==anotherExample);
        System.out.println(anotherExample==anotherOtherExample);
    }
}
