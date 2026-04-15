import java.util.Scanner;

public class PartC {

    // Function: takes int, returns String with binary digits
    public static String toBinaryString(int number) {
        if (number == 0) {
            return "0";
        }

        String binary = "";

        while (number > 0) {
            int digit = number % 2;
            binary = digit + binary;
            number = number / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String result = toBinaryString(num);
        System.out.println("Binary string: " + result);

        sc.close();
    }
}
