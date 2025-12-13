package Human;

import Item.*;

import java.util.ArrayList;

public class Human {
    private String Name;
    private ArrayList<Item> Items;
    private Double Mood = 5.0;

    public Human(String Name, ArrayList<Item> Items) {
        this.Name = Name;
        this.Items = Items;
    }

    public void setItems(ArrayList<Item> Items) {
        this.Items = Items;
    }

    public void setMood(Double Mood) {
        this.Mood = Mood;
    }

    public String getName() {
        String s = Name;
        return s;
    }

    public ArrayList<Item> getItems() {
        ArrayList<Item> s = Items;
        return s;
    }

    public Double getMood() {
        Double s = Mood;
        return s;
    }

    public String HowFeel() {
        String s;
        if (Mood < 0.0) {
            s = "ужасное";
        } else if ((0.0 <= Mood) && (Mood < 2.5)) {
            s = "так себе";
        } else if ((2.5 <= Mood) && (Mood < 7.5)) {
            s = "нормальное";
        } else if ((7.5 <= Mood) && (Mood < 10.0)) {
            s = "хорошее";
        } else {
            s = "прекрасное";
        }
        return "настроение у " + Name + " " + s;
    }

    public String WhatsOwn() {
        String s = Name + " владеет этими вещами:\n";
        for (Item Item : Items) {
            s += Item.getMany() + " " + Item.getName() + ", Размер: " + Item.getVolume() + ", Вес: " + Item.getWeight() + ", Материал: " + Item.getMaterial() + ";\n";
        }
        return s;
    }
}