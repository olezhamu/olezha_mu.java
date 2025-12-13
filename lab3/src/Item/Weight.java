package Item;

public enum Weight {
    SMALL("маленький"),
    MEDIUM("средний"),
    BIG("большой"),
    ENORMOUSE("очень большой");

    private final String Weight;

    Weight(String Weight){this.Weight = Weight;}

    public String getWeight() {
        return Weight;
    }
}
