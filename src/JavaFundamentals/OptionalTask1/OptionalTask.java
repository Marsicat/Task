package JavaFundamentals.OptionalTask1;

import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 4;
        String [] stringNumbers = new String [n];
        System.out.println("Введите " + n + " чисел и нажмите enter");
        String number = scanner.nextLine();
        String longNumber = " ";
        String shortNumber = number;
        for (String i : number.split(" ")) {
            if (i.length() < shortNumber.length()&& i.length() !=0) {
                shortNumber = i;
            }
            if (i.length() > longNumber.length()) {
                longNumber = i;
            }
        }
        System.out.println("Самое длинное число " + longNumber + " и его длина составляет " + longNumber.length());
        System.out.println("Самое короткое число " + shortNumber + " и его длина составляет " + shortNumber.length());



    }
}


