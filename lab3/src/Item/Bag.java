package Item;

public class Bag extends Item{
    public String NameWhatInside;

    public Bag(String NameWhatInside, String Volume, String Many, Weight Weight, String Material) {
        super(NameWhatInside, Volume, Many, Weight, Material);
        this.NameWhatInside = NameWhatInside;
    }

    @Override
    public String getName() {
        return "мешок с " + NameWhatInside;
    }

    @Override
    public String getInfo() {
        return Many + " мешок с " + NameWhatInside + ", Размер: " + Volume + ", Вес: " + Weight + ", Материал: " + Material;
    }
}