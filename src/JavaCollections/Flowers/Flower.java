package JavaCollections.Flowers;

public class Flower {
     public String nameFlower;
     public double priceFlower;
     public int lengthFlower;
     public int ageFlower;


    public Flower (String nameFlower, double priceFlower, int lengthFlower, int ageFlower) {

    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public double getPriceFlower() {
        return  priceFlower;
    }

    public void setPriceFlower(int priceFlower) {
        this.priceFlower = priceFlower;
    }

    public int getLengthFlower() {
        return lengthFlower;
    }

    public void setLengthFlower(int lengthFlower) {
        this.lengthFlower = lengthFlower;
    }

    public int getAgeFlower() {
        return ageFlower;
    }

    public void setAgeFlower(int ageFlower) {
        this.ageFlower = ageFlower;
    }
}
