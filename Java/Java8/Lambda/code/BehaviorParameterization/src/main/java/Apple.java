package main.java;

public class Apple {
    private Colors colors;
    private Double weight;
    private String origin;

    public Apple(Colors colors, Double weight, String origin) {
        this.colors = colors;
        this.weight = weight;
        this.origin = origin;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
