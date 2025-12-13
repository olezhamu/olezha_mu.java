package Action;

import Human.*;
import Item.*;

import java.util.ArrayList;

public class IsHolding extends Action {
    private Integer HoldAbility = 0;
    protected Human Human;
    protected ArrayList<Item> Items;
    protected ArrayList<Item> ItemsToHold;

    public IsHolding(Human Human, ArrayList<Item> Items) {
        super(Human);
        this.Human = Human;
        this.Items = Items;
        for (Item Item : Human.getItems()) {
            switch (Item.getWeight()) {
                case "маленький" -> HoldAbility += 1;
                case "средний" -> HoldAbility += 2;
                case "большой" -> HoldAbility += 5;
                case "очень большой" -> HoldAbility += 11;
            }
        }
        ItemsToHold = Human.getItems();
    }

    public ArrayList<Item> Hold() {
        System.out.print(Human.getName() + " взял ");
        for (Item Item : Items) {
            switch (Item.getWeight()){
                case "маленький" -> HoldAbility += 1;
                case "средний" -> HoldAbility += 2;
                case "большой" -> HoldAbility += 5;
                case "очень большой" -> HoldAbility += 11;
            }
            if (HoldAbility < 5) {
                System.out.print(Item.getMany() + " " + Item.getName() + ", ");
                ItemsToHold.add(Item);
                Human.setMood(Human.getMood()+0.1);
            } else if (HoldAbility == 5) {
                System.out.println(Item.getMany() + " " + Item.getName());
                ItemsToHold.add(Item);
                Human.setItems(ItemsToHold);
                Human.setMood(Human.getMood()+0.1);
                super.setWhatActionsAreDone("взял вещи");
                return ItemsToHold;
            } else if ((5 < HoldAbility) && (HoldAbility< 5*2+1)) {
                System.out.println("");
                Human.setItems(ItemsToHold);
                super.setWhatActionsAreDone("взял вещи");
                return ItemsToHold;
            }else {
                System.out.println("");
                Human.setItems(new ArrayList<Item>(0));
                Human.setMood(Human.getMood()-1.0);
                return new ArrayList<Item>(0);
            }
        }
        System.out.println("");
        Human.setItems(ItemsToHold);
        Human.setMood(Human.getMood());
        super.setWhatActionsAreDone("взял вещи");
        return ItemsToHold;
    }

    @Override
    public String toString() {
        String s = Human.getName() + " держит эти вещи: ";
        for (Item Item : ItemsToHold){
            s += Item.getInfo() + "; ";
        }
        return s;
    }
}