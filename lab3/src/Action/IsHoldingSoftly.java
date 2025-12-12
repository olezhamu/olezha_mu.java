package Action;

import Human.*;
import Item.*;

import java.util.ArrayList;

public class IsHoldingSoftly extends IsHolding {
    private Integer HoldAbility = 0;
    public Human Human;
    public ArrayList<Item> Items;
    public ArrayList<Item> ItemsToHold;

    public IsHoldingSoftly(Human Human, ArrayList<Item> Items) {
        super(Human, Items);
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
        for (Item Item : Items) {
            switch (Item.getWeight()){
                case "маленький" -> HoldAbility += 1;
                case "средний" -> HoldAbility += 2;
                case "большой" -> HoldAbility += 5;
            }
            if (HoldAbility < 3) {
                ItemsToHold.add(Item);
                Human.setMood(Human.getMood()+0.1);
            } else if (HoldAbility == 3) {
                ItemsToHold.add(Item);
                Human.setItems(ItemsToHold);
                Human.setMood(Human.getMood()+0.1);
                super.setWhatActionsAreDone("прихватил вещи");
                return ItemsToHold;
            } else if ((3 < HoldAbility) && (HoldAbility< 3*2+1)) {
                Human.setItems(ItemsToHold);
                super.setWhatActionsAreDone("прихватил вещи");
                return ItemsToHold;
            }else {
                Human.setItems(new ArrayList<Item>(0));
                Human.setMood(Human.getMood()-1.0);
                return new ArrayList<Item>(0);
            }
        }
        Human.setItems(ItemsToHold);
        Human.setMood(Human.getMood());
        super.setWhatActionsAreDone("прихватил вещи");
        return ItemsToHold;
    }

    @Override
    public String getResult() {
        String s = Human.getName() + " прихватил эти вещи: ";
        for (Item Item : ItemsToHold){
            s += Item.getInfo() + "; ";
        }
        return s;
    }
}