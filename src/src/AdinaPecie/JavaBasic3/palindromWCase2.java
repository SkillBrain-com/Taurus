package AdinaPecie.JavaBasic3;



public class palindromWCase2 {

    public static void Check(){

        String str = "assa";
        boolean ok = true;
        for (int i = 0; i< str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                ok = false;
        }
        System.out.println(" It is palindrom = " + ok);
        }

    public static void main(String[] args) {
        Check();
    }
    }

