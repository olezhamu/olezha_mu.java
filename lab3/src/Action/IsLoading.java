package Action;

import Boat.*;
import Human.*;
import Item.*;

import java.util.ArrayList;
import java.util.Arrays;

public class IsLoading extends Action {
    public Boat Boat;
    public Human Human;
    public ArrayList<Item> Items;
    public Integer HoldAbility;
    public Double Mood;
    public ArrayList<Item> ItemsToTransport;

    public IsLoading(Human Human, Boat Boat) {
        super(Human);
        this.Boat = Boat;
        this.Human = Human;
        Items = Human.getItems();
        HoldAbility = Boat.getHoldability();
        for (Item Item : Items) {
            switch (Item.getWeight()) {
                case "маленький" -> {HoldAbility -= 1;}
                case "средний" -> {HoldAbility -= 2;}
                case "большой" -> {HoldAbility -= 5;}
            }
        }
        Mood = Human.getMood();
        ItemsToTransport = Boat.getCargo();
    }

    public ArrayList<Item> Loading() throws InterruptedException {
        System.out.print(Human.getName() + " погрузил ");
            for (Item Item : Items) {
                switch (Item.getWeight()) {
                    case "маленький" -> {HoldAbility -= 1;Thread.sleep(5000);}
                    case "средний" -> {HoldAbility -= 2;Thread.sleep(7500);}
                    case "большой" -> {HoldAbility -= 5;Thread.sleep(10000);}
                }
                if (HoldAbility > 0) {
                    System.out.print(Item.getMany() + " " + Item.getName() + ", ");
                    ItemsToTransport.add(Item);
                    Mood += 0.1;
                } else if (HoldAbility == 0) {
                    System.out.print(Item.getMany() + " " + Item.getName());
                    ItemsToTransport.add(Item);
                    Boat.setCargo(ItemsToTransport);
                    Mood += 0.1;
                    Human.setMood(Mood);
                    super.setWhatActionsAreDone("погрузил вещи");
                    for (Item Item1 : Items) {
                        if (ItemsToTransport.contains(Item1)) {
                            continue;
                        } else {
                            Items.remove(Item1);
                        }
                    }
                    Human.setItems(Items);
                    return ItemsToTransport;
                } else if ((-1 < HoldAbility) && (HoldAbility < 0)) {
                    System.out.println("");
                    Boat.setCargo(ItemsToTransport);
                    Human.setMood(Mood);
                    super.setWhatActionsAreDone("погрузил вещи");
                    for (Item Item1 : Items) {
                        if (ItemsToTransport.contains(Item1)) {
                            continue;
                        } else {
                            Items.remove(Item1);
                        }
                    }
                    Human.setItems(Items);
                    return ItemsToTransport;
                } else {
                    System.out.println("");
                    System.out.println(Boat.Sinking());
                    Mood -= 2.0;
                    Human.setMood(Mood);
                    return new ArrayList<Item>(0);
                }
            }
            System.out.println("");
            Boat.setCargo(ItemsToTransport);
            Human.setMood(Mood);
            super.setWhatActionsAreDone("погрузил вещи");
            Human.setItems(new ArrayList<Item>(0));
            return ItemsToTransport;
    }

    @Override
    public String toString() {
        String s = Human.getName() + " грузит эти вещи: ";
        for (Item Item : ItemsToTransport){
            s += Item.getInfo() + "; ";
        }
        s += "на " + Boat.getName();
        return s;
    }
}