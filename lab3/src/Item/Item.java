package Item;

public class Item {
    public String Name;
    public String Material;
    public String Many;
    public String Volume;
    public String Weight;

    public Item(String Name, String Volume, String Many, String Weight, String Material){
        this.Name = Name;
        this.Volume = Volume;
        this.Many = Many;
        this.Weight = Weight;
        this.Material = Material;
    }

    public String getName() {
        return Name;
    }

    public String getMany() {
        return Many;
    }

    public String getWeight() {
        return Weight;
    }

    public String getMaterial() {
        return Material;
    }

    public String getVolume() {
        return Volume;
    }

    public String getInfo() {
        return Many + " " + Name + ", Размер: " + Volume + ", Вес: " + Weight + ", Материал: " + Material;
    }
}