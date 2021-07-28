package JavaCollections.Flowers;

import java.util.Arrays;
import java.util.List;

public class Runner{

   static List<Flower> flowers = Arrays.asList(
           new Flower("красная роза", 3.5, 60, 3),
           new Flower("белая роза", 4.0, 65, 5),
           new Flower("желтая роза", 4.5, 55, 4),
           new Flower("орхидея", 5.0, 70, 6),
           new Flower("лилия", 2.0, 50, 2)
   );

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(flowers);
        System.out.println("Количество цветов в букете " + bouquet.numberOfFlowers());
        System.out.println("Стоимость цветов в букете " + bouquet.price());
        System.out.println("Сортировка цветов в букете по уровню свежести: " );
        bouquet.ageSort();
        System.out.println( "Цветок с заданным диапазоном стебля " + bouquet.stemSearch(60,70) );
    }
}
