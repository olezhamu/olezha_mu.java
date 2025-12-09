package Action;

import Boat.*;
import Human.*;
import Item.*;

public class IsHolding extends Action {
    private Integer HoldAbility = 0;
    public Human Human;
    public Item[] Items;
    public Item[] ItemsToHold = new Item[0];

    public IsHolding(Human Human, Item[] Items) {
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

    public Item[] Hold() {
        for (Item Item : Items) {
            switch (Item.getWeight()){
                case "маленький" -> HoldAbility += 1;
                case "средний" -> HoldAbility += 2;
                case "большой" -> HoldAbility += 5;
                case "очень большой" -> HoldAbility += 11;
            }
            if (HoldAbility < 5) {
                ItemsToHold[ItemsToHold.length] = Item;
                Human.setMood(Human.getMood()+0.1);
            } else if (HoldAbility == 5) {
                ItemsToHold[ItemsToHold.length] = Item;
                Human.setItems(ItemsToHold);
                Human.setMood(Human.getMood()+0.1);
                super.setWhatActionsAreDone("взял вещи");
                return ItemsToHold;
            } else if ((5 < HoldAbility) && (HoldAbility< 5*2+1)) {
                Human.setItems(ItemsToHold);
                super.setWhatActionsAreDone("взял вещи");
                return ItemsToHold;
            }else {
                Human.setItems(new Item[0]);
                Human.setMood(Human.getMood()-1.0);
                return new Item[0];
            }
        }
        Human.setItems(ItemsToHold);
        Human.setMood(Human.getMood());
        super.setWhatActionsAreDone("взял вещи");
        return ItemsToHold;
    }

    @Override
    public String getResult() {
        String s = Human.getName() + " держит эти вещи: ";
        for (Item Item : ItemsToHold){
            s += Item.getInfo() + "; ";
        }
        return s;
    }
}