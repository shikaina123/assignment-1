import java.util.Scanner;  

public class PartB {  

    // Function: takes int, returns int[] with binary digits  
    public static int[] toBinaryArray(int number) {  
        if (number == 0) {  
            int[] zero = {0};  
            return zero;  
        }  

        // Count digits first  
        int temp = number;  
        int count = 0;  
        while (temp > 0) {  
            count++;  
            temp = temp / 2;  
        }  

        // Make array and fill from right  
        int[] result = new int[count];  
        int i = count - 1;  

        while (number > 0) {  
            result[i] = number % 2;  
            number = number / 2;  
            i--;  
        }  

        return result;  
    }  

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter an integer: ");  
        int num = sc.nextInt();  

        int[] binaryArray = toBinaryArray(num);  

        System.out.print("Binary array: ");  
        for (int j = 0; j < binaryArray.length; j++) {  
            System.out.print(binaryArray[j]);  
        }  

        sc.close();  
    }  
}  
