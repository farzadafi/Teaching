package main.java.base;

public class Apple {
    private final Colors colors;
    private final Double weight;
    private final String origin;

    public Apple(Colors colors, Double weight, String origin) {
        this.colors = colors;
        this.weight = weight;
        this.origin = origin;
    }

    public Colors getColors() {
        return colors;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "colors=" + colors +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
