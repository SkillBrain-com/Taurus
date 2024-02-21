package kateaManoila.Java2;

public class Java2 {


   public static void main(String[] args) {
        //instructiunea if-daca:
        int number = 20;
        if (number < 0){
            System.out.println("Numarul este mai mic de cit 0");
        }else {
            System.out.println("an intrat pe ramura else");
        }

        // conditia ? instructiunea true :instructiunea false
        System.out.println(number<0 ? "instructiuni a fost true": "instructiunea a fost false");



       System.out.println("dupa instructiunea if");

       double nota = 5.8;

       if(nota==10){
           System.out.println("studentul a primit nota maxima");
       }else if (nota==9){
           System.out.println("Studentul a ptimit nota 9");
       } else if (nota<10 && nota>6) {
           System.out.println("Studentul a primit nota 8,  6");

       }else {
           System.out.println("Am executat ramura ELSE");
       }
       // instructiia if-else-if
      String ziua = "luni";
       if (ziua =="sinbata"){
           System.out.println("Ziua de azi e sinbata");
       } else if (ziua == "duminica") {
           System.out.println("Ziua de azi e duminica");

       }else {
           System.out.println("A trecut uichend-ul");
       }

       switch (ziua){
           case "sinbata":{
               System.out.println("Ziua sinbata -switch");
               break;
           } case "duminica":{
               System.out.println("Ziua duminica -switch");
               break;
           } default:{
               System.out.println("A trecut uichendul -switch");
           }

       }


   }

}
