package Action;

import Boat.*;
import Human.*;
import Item.*;

public class Set {
    public Human Human;
    public Item[] Items;

    public Set(Human Human, Item[] Items) {
        this.Human = Human;
        this.Items = Items;
    }
}