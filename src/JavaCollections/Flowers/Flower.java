package JavaCollections.Flowers;

public class Flower {
     String nameFlower;
     private double priceFlower;
     private int lengthFlower;
     private int ageFlower;

    public Flower (String nameFlower, double priceFlower, int lengthFlower, int ageFlower) {
    this.nameFlower = nameFlower;
    this.priceFlower = priceFlower;
    this.lengthFlower = lengthFlower;
    this.ageFlower = ageFlower;
    }

    public String getNameFlower() { return nameFlower;
    }
    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }
    public double getPriceFlower() { return  priceFlower;
    }
    public void setPriceFlower(double priceFlower) {
        this.priceFlower = priceFlower;
    }
    public int getLengthFlower() { return lengthFlower;
    }
    public void setLengthFlower(int lengthFlower) {
        this.lengthFlower = lengthFlower;
    }
    public int getAgeFlower() { return ageFlower;
    }
    public void setAgeFlower(int ageFlower) {
        this.ageFlower = ageFlower;
    }
}
