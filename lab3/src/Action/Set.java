package Action;

import Boat.*;
import Human.*;
import Item.*;

import java.util.ArrayList;

public class Set {
    public Human Human;
    public ArrayList<Item> Items;
    public Boat Boat;

    public Set(Human Human, ArrayList<Item> Items, Boat Boat) {
        this.Human = Human;
        this.Items = Items;
        this.Boat = Boat;
    }
}