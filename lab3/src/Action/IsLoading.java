package Action;

import Boat.*;
import Human.*;
import Item.*;

import java.util.Arrays;

public class IsLoading extends Action {
    public Boat Boat;
    public Human Human;
    public Item[] Items;
    public Integer HoldAbility;
    public Double Mood;
    public Item[] ItemsToTransport = new Item[0];

    public IsLoading(Human Human, Boat Boat) {
        super(Human);
        this.Boat = Boat;
        this.Human = Human;
        Items = Human.getItems();
        HoldAbility = Boat.getHoldability();
        Mood = Human.getMood();
        ItemsToTransport = Boat.getCargo();
    }

    public Item[] Loading() throws InterruptedException {
            for (Item Item : Items) {
                switch (Item.getWeight()) {
                    case "маленький" -> {HoldAbility -= 1;Thread.sleep(5000);}
                    case "средний" -> {HoldAbility -= 2;Thread.sleep(7500);}
                    case "большой" -> {HoldAbility -= 5;Thread.sleep(10000);}
                }
                if (HoldAbility > 0) {
                    ItemsToTransport[ItemsToTransport.length] = Item;
                    Mood += 0.1;
                } else if (HoldAbility == 0) {
                    ItemsToTransport[ItemsToTransport.length] = Item;
                    Boat.setCargo(ItemsToTransport);
                    Mood += 0.1;
                    Human.setMood(Mood);
                    super.setWhatActionsAreDone("погрузил вещи");
                    Boat.setHoldability(HoldAbility);
                    Human.setItems(Arrays.copyOfRange(Items, ItemsToTransport.length - 1, Items.length));
                    return ItemsToTransport;
                } else if ((-1 < HoldAbility) && (HoldAbility < 0)) {
                    Boat.setCargo(ItemsToTransport);
                    Human.setMood(Mood);
                    super.setWhatActionsAreDone("погрузил вещи");
                    Boat.setHoldability(HoldAbility);
                    Human.setItems(Arrays.copyOfRange(Items, ItemsToTransport.length - 1, Items.length));
                    return ItemsToTransport;
                } else {
                    System.out.println(Boat.Sinking());
                    Mood -= 2.0;
                    Human.setMood(Mood);
                    return new Item[0];
                }
            }
            Boat.setCargo(ItemsToTransport);
            Human.setMood(Mood);
            super.setWhatActionsAreDone("погрузил вещи");
            Boat.setHoldability(HoldAbility);
            Human.setItems(new Item[0]);
            return ItemsToTransport;
    }

    @Override
    public String getResult() {
        String s = Human.getName() + " грузит эти вещи: ";
        for (Item Item : ItemsToTransport){
            s += Item.getInfo() + "; ";
        }
        s += "на " + Boat.getName();
        return s;
    }
}