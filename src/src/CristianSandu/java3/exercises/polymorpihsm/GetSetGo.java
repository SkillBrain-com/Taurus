package CristianSandu.java3.exercises.polymorpihsm;

public interface GetSetGo {
    static final int count = 1;

}

class TestMyGetSetGo {
    public static void main(String[] args) {
        GetSetGo[] getSetGos = new GetSetGo[5];
        for (GetSetGo onMyMark : getSetGos) {
            System.out.println(GetSetGo.count);
//            GetSetGo.count++;// asa NU
        }
        System.out.println("Started race!");
    }


}
