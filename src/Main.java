import java.util.Scanner;
public class Main {

    static boolean İsPolindrom (int number)
    {
        int temp=number,lastNumber,reverseNumber=0;

        while (temp!=0)
        {
            //System.out.println("======= ");
           lastNumber= temp % 10; // temp'in Son sayısını buluyoruz
            //System.out.println("Last Number = "+lastNumber);

           reverseNumber=  (reverseNumber * 10) + lastNumber ;  //0*10=0+7 =7  => 7*10=70+2=71 ....
            //System.out.println("reverseNumber  = "+reverseNumber);
           temp /=10;   //temp'in sonunda ki sayıyı siliyoruz.

        }

        System.out.println("number  = "+number);
        System.out.println("temp  = "+reverseNumber);
        if (reverseNumber==number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.println(İsPolindrom(245));
    }
}