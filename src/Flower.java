import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Flower {
    public String getCountry;
    public double getCost;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;


    public String name;

    public int quantity;


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

    public int getQuantity() {

        if (quantity < 0) {
            this.quantity = quantity;

        } else {
            this.quantity = 0;
        }
        return quantity;
    }

    public int setQuantity(int quantity) {
        this.quantity = quantity;
        return quantity;
    }

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

    public BigDecimal getCost() {

        if (cost <= 0) {
            this.cost = 1;

        } else {
            this.cost = cost;
        }
        return BigDecimal.valueOf(cost);
    }

    public int getLifeSpan() {

        if (lifeSpan < 0) {
            this.lifeSpan = 3;

        } else {
            this.lifeSpan = lifeSpan;
        }
        return lifeSpan;
    }

    public static double theCostOfTheBouquet(Flower rose, int quantity1, Flower chrysanthemum, int quantity2, Flower pion, int quantity3,
                                             Flower gypsophila, int quantity4) {
        gypsophila.quantity = quantity4;
        pion.quantity = quantity3;
        chrysanthemum.quantity = quantity2;
        rose.quantity = quantity1;
        double summ = ((rose.getCost * quantity1) + (chrysanthemum.getCost * quantity2) + (pion.getCost * quantity3) + (gypsophila.getCost * quantity4));
        summ += summ * 0.1;
        return summ;

    }
    public static int getMin(int[] lifeSpanl) {

        int minValue = lifeSpanl[0];
        for (int i = 1; i < lifeSpanl.length; i++) {
            if (lifeSpanl[i] < minValue) {
                minValue = lifeSpanl[i];
            }
        }
        return minValue;

    }


}


