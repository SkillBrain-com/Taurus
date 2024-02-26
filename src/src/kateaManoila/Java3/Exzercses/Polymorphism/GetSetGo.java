package kateaManoila.Java3.Exzercses.Polymorphism;

public interface GetSetGo {
    int count = 1 ;
}
class TestMyGetSetGo {

    public static void main(String[] args) {
        GetSetGo[] getSetGos = new GetSetGo[5];
        for (GetSetGo onMyMark : getSetGos){
            System.out.println(GetSetGo.count);
          //  GetSetGo.count ++;//asa nu
        }
        System.out.println("Started race");
    }
}
