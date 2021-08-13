package JavaCollections.Flowers;
import java.util.*;

public class Bouquet {
    public List<Flower> flowers;
    private double bouquetPrice;
    private int numberOfFlowers;

    public Bouquet(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public int numberOfFlowers() {
      numberOfFlowers = flowers.size();
        return numberOfFlowers;
    }

    public double price() {
        for (int i = 0; i < flowers.size(); i++) {
            bouquetPrice += flowers.get(i).getPriceFlower();
        }
        return bouquetPrice;
    }

    public void ageSort() {
        Collections.sort(flowers, new Comparator<Flower>() {
            public int compare(Flower o1, Flower o2) {
                return o1.getAgeFlower() - o2.getAgeFlower();
            }
        });
        for (int i = 0; i < flowers.size(); i++) {
            System.out.printf("%s;",flowers.get(i).getNameFlower() );
           }
        System.out.println();
    }

    public String stemSearch(int minStem, int maxStem) {
        ArrayList flower = new ArrayList();
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getLengthFlower() >= minStem && flowers.get(i).getLengthFlower() <= maxStem) {
                flower.add(flowers.get(i).getNameFlower());
            }
        }
        if (flower.isEmpty()) {
            return " в букете отсутствует";
        } else
            return flower.toString();
    }
}






