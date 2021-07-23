package JavaFundamentals.MainTask1;

import java.util.Scanner;

public class Month {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12");
        int i = scanner.nextInt();
        String month []= {"January", "February", "March", "April","May", "June", "July", "August", "September", "October", "November", "December"};
        if ((i-1) >= 0 && i <= month.length) {
            System.out.println(month[(i-1)]);
        }
        else{
            System.out.println("Entered number is incorrect");
        }
    }
}
