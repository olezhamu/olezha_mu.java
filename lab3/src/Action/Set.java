package Action;

import Boat.*;
import Human.*;
import Item.*;

public class Set {
    public Human Human;
    public Item[] Items;
    public Boat Boat;

    public Set(Human Human, Item[] Items, Boat Boat) {
        this.Human = Human;
        this.Items = Items;
        this.Boat = Boat;
    }
}