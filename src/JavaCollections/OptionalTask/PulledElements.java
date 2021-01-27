package JavaCollections.OptionalTask;

import java.util.ArrayList;
import java.util.List;

public class PulledElements {
    public static void main (String [] args) {
        List <Integer> elements = new ArrayList<>();
        elements.add(-10);
        elements.add(8);
        elements.add(5);
        elements.add(4);
        elements.add(-20);
        elements.add(-12);
        elements.add(26);

        int replace = 0;
        int i = 0;
        while ( i < elements.size()-replace) {
            if (elements.get(i)<0) {
                elements.add (elements.get(i));
                elements.remove (elements.get(i));
                replace++;
            }
            else i++;
        }
        System.out.println(elements);
    }
}
