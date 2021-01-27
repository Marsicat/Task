package JavaCollections.OptionalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NumbersInStack {
    public static void main (String[] args){
        int number = 8895;
        int arrayNumber [] = new int[4];
        for (int i= arrayNumber.length-1;i>=0;i--) {
            arrayNumber[i] += number % 10;
            number /= 10;
        }
        List<Integer> listArrayNumber = new ArrayList<Integer>(arrayNumber.length);
        for (int value : arrayNumber) {
            listArrayNumber.add(value);
        }
        System.out.println(listArrayNumber);

        Stack<Integer> stackNumbers = new Stack<>();
        while(listArrayNumber.size() > 0) {
            stackNumbers.push(listArrayNumber.remove(0));
        }
        while(stackNumbers.size() > 0){
            listArrayNumber.add(stackNumbers.pop());
        }
        System.out.println(listArrayNumber);


    }
}
