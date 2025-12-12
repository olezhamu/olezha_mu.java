package Human;

import Item.*;

import java.util.ArrayList;

public class Human {
    public String Name;
    public ArrayList<Item> Items;
    public Double Mood = 5.0;

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
        return Name;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public Double getMood() {
        return Mood;
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