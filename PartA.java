import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Convert to binary using simple logic
        if (number == 0) {
            System.out.println("Binary: 0");
        } else {
            String binary = "";
            while (number > 0) {
                int digit = number % 2;
                binary = digit + binary;
                number = number / 2;
            }
            System.out.println("Binary: " + binary);
        }

        sc.close();
    }
}
