package Item;

public enum Weight {
    SMALL("маленький"),
    MEDIUM("средний"),
    BIG("большой"),
    ENORMOUSE("очень большой");

    private final String weight;

    Weight(String weight){this.weight = weight;}

    public String getWeight() {
        return weight;
    }
}
