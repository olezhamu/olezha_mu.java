package Action;

import Boat.*;
import Human.*;
import Item.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Set {
    public Human Human;
    public ArrayList<Item> Items;
    public Boat Boat;

    public Set(Human Human, ArrayList<Item> Items, Boat Boat) {
        this.Human = Human;
        this.Items = Items;
        this.Boat = Boat;
    }

    public void Hold() {
        new IsHolding(Human, Items).Hold();
    }

    public void HoldSoft() {
        new IsHoldingSoftly(Human, Items).Hold();
    }

    public void Load() throws InterruptedException {
        new IsLoading(Human, Boat).Loading();
    }

    public void Transport() throws InterruptedException {
        new IsTransportating(Boat).Transportation();
    }

    public void Unload() throws InterruptedException {
        new IsUnloading(Human, Boat).Unloading();
    }
}