package Item;

public class Item {
    protected String Name;
    protected String Material;
    protected String Many;
    protected String Volume;
    protected String Weight;

    public Item(String Name, String Volume, String Many, Weight Weight, String Material){
        this.Name = Name;
        this.Volume = Volume;
        this.Many = Many;
        this.Weight = Weight.getWeight();
        this.Material = Material;
    }

    public String getName() {
        String s = Name;
        return s;
    }

    public String getMany() {
        String s = Many;
        return s;
    }

    public String getWeight() {
        String s = Weight;
        return s;
    }

    public String getMaterial() {
        String s = Material;
        return s;
    }

    public String getVolume() {
        String s = Volume;
        return s;
    }

    public String getInfo() {
        return Many + " " + Name + ", Размер: " + Volume + ", Вес: " + Weight + ", Материал: " + Material;
    }
}