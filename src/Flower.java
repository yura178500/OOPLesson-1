public class Flower {
    public String getCountry;
    public double getCost;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;
    public String name;


    public String getFlowerColor() {

        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";

        } else {
            this.flowerColor = flowerColor;
        }
        return flowerColor;
    }

    public String getCountry() {
        this.country = country;

        if (country == null || country.isEmpty()) {
            this.country = "Россия";

        } else {
            this.country = country;
        }
        return country;
    }

    public double getCost() {

        if (cost <= 0) {
            this.cost = 1;

        } else {
            this.cost = cost;
        }
        return cost;
    }

    public int getLifeSpan() {

        if (lifeSpan < 0) {
            this.lifeSpan = 3;

        } else {
            this.lifeSpan = lifeSpan;
        }
        return lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }


}
