package AdinaPecie.JavaBasic3;

public class PalindromNumber {
    public static void main(String[] args) {

    int number = 15635;
    int auxNumber = number;
    int reverseNumber = 0;

        while(number > 0)
    {
        reverseNumber = reverseNumber*10+number%10;

        number = number/10;

    }
     if(auxNumber == reverseNumber)
            System.out.println("It is palindrom");
     else
             System.out.println("It is not a palindrom");
        System.out.println(number + "  " + auxNumber + "  " + reverseNumber );
}
}
