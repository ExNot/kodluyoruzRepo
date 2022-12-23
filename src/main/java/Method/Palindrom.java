package Method;
public class Palindrom {
    static boolean isPalindrom(int number){
        int temp = number;
        int reverseNumber = 0;
        while (temp != 0){
            int lastDigit = temp%10;
            reverseNumber = (reverseNumber*10) + lastDigit;
            temp/=10;
        }
        if (number == reverseNumber)
            return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4));


    }
}
