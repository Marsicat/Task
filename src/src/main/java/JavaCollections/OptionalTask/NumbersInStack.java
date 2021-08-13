package JavaCollections.OptionalTask;

import java.util.*;

public class NumbersInStack {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите enter");
        int number = scanner.nextInt();
        int arrayNumber [] = new int[String.valueOf(Math.abs(number)).length()];
        for (int i= arrayNumber.length-1;i>=0;i--) {
            arrayNumber[i] += number % 10;
            number /= 10;
        }
        List<Integer> listArrayNumber = new ArrayList<Integer>(arrayNumber.length);
        for (int value : arrayNumber) {
            listArrayNumber.add(value);
        }

        Stack<Integer> stackNumbers = new Stack<>();
        while(listArrayNumber.size() > 0) {
            stackNumbers.push(listArrayNumber.remove(0));
        }
        while(stackNumbers.size() > 0){
            listArrayNumber.add(stackNumbers.pop());
        }

        int finalArrayNumber[] = new int[listArrayNumber.size()];
        for (int i=0; i< finalArrayNumber.length;i++){
            finalArrayNumber[i] = listArrayNumber.get(i);
        }
        int finalNumber = 0;
        for (int d : finalArrayNumber)
            finalNumber= 10 * finalNumber + d;
        System.out.println(finalNumber);
    }
}
