package JavaCollections.Flowers;


import java.util.*;

public class Assortment extends Flower {
      public Assortment(String nameFlower, double priceFlower, int lengthFlower, int ageFlower) {
        super(nameFlower, priceFlower, lengthFlower, ageFlower);
        this.nameFlower = nameFlower;
        this.priceFlower = priceFlower;
        this.ageFlower = ageFlower;
        this.lengthFlower = lengthFlower;
    }
      public static void main(String[] args) {
        Flower redRose = new Assortment("красная роза", 3.5, 60, 3);
        Flower whiteRose = new Assortment("белая роза", 4.0, 65, 5);
        Flower yellowRose = new Assortment("желтая роза", 4.5, 55, 4);
        Flower orchid = new Assortment("орхидея", 5.0, 70, 6);
        Flower lily = new Assortment("лилия", 2.0, 50, 2);
        double pricePackagingFlower = 4.0;
        double bouquetPrice = 0;
        List<Flower> HolidayBouquet = new ArrayList<>();
        HolidayBouquet.add(redRose);
        HolidayBouquet.add(whiteRose);
        HolidayBouquet.add(yellowRose);
        HolidayBouquet.add(orchid);
        HolidayBouquet.add(lily);

        System.out.println("Стоимость цветов в букете:");
        double flowersPrice =0;
        for (int i = 0; i < HolidayBouquet.size(); i++) {
            System.out.print( HolidayBouquet.get(i).getNameFlower() + " " + "+" + "");
            System.out.print(HolidayBouquet.get(i).getPriceFlower() + " ");
            flowersPrice += HolidayBouquet.get(i).getPriceFlower();

        }
        System.out.println("Всего стоимость цветов " +flowersPrice);
        bouquetPrice = flowersPrice+pricePackagingFlower;
        System.out.println("Стоимость букета в упаковке " + bouquetPrice);

        Collections.sort(HolidayBouquet, new Comparator<Flower>() {
        @Override
        public int compare(Flower o1, Flower o2) {
            return o1.getAgeFlower()-o2.getAgeFlower();
        }
        });
        System.out.println("Сортировка цветов в букете с указанием количества дней после срезки:");
        for (int i = 0; i < HolidayBouquet.size(); i++) {
            System.out.print( HolidayBouquet.get(i).getNameFlower() + " " );
            System.out.print(HolidayBouquet.get(i).getAgeFlower() +" ");

        }
        System.out.println();
        System.out.println("Цветы с диапазоном стеблей от 60 до 70см : ");
        for (int i = 0; i < HolidayBouquet.size(); i++) {
            if (HolidayBouquet.get(i).getLengthFlower() >= 60 && HolidayBouquet.get(i).getLengthFlower()<=70){
            System.out.print(HolidayBouquet.get(i).getNameFlower()+" "+ HolidayBouquet.get(i).getLengthFlower() +" ");
            }
        }
    }
    }










