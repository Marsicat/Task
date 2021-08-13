package JavaFundamentals.OptionalTask1;

import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа и нажмите enter");
        String number = scanner.nextLine();
        String longNumber = " ";
        String shortNumber = number;
        for (String i : number.split(" ")) {
            if (i.length() < shortNumber.length()&& i.length() !=0) {
                shortNumber = i;
            }
            if (i.length() >= longNumber.length()) {
                longNumber = i;
            }
        }
        if (shortNumber.length()==longNumber.length()){
            System.out.printf("Длина всех чисел одинакова и составляет %d ", shortNumber.length());
        } else {
            System.out.printf("Самое длинное число %s и его длина составляет %d%n", longNumber, longNumber.length());
            System.out.printf("Самое короткое число %s и его длина составляет %d ", shortNumber, shortNumber.length());
        }

    }
}


