package Action;

import Human.*;
import Item.*;

public class IsHoldingSoftly extends IsHolding{
    private Integer HoldAbility = 0;
    public Human Human;
    public Item[] Items;
    public Item[] ItemsToHold = new Item[0];

    public IsHoldingSoftly(Human Human, Item[] Items) {
        super(Human, Items);
        this.Human = Human;
        this.Items = Items;
        for (Item Item : Human.getItems()) {
            switch (Item.getWeight()) {
                case "маленький" -> HoldAbility += 1;
                case "средний" -> HoldAbility += 2;
                case "большой" -> HoldAbility += 5;
            }
        }
        ItemsToHold = Human.getItems();
    }

    @Override
    public Item[] Hold() {
        for (Item Item : Items) {
            switch (Item.getWeight()){
                case "маленький" -> HoldAbility += 1;
                case "средний" -> HoldAbility += 2;
                case "большой" -> HoldAbility += 5;
            }
            if (HoldAbility < 3) {
                ItemsToHold[ItemsToHold.length] = Item;
                Human.setMood(Human.getMood()+0.05);
            } else if (HoldAbility == 3) {
                ItemsToHold[ItemsToHold.length] = Item;
                Human.setItems(ItemsToHold);
                Human.setMood(Human.getMood()+0.05);
                super.setWhatActionsAreDone("прихватил вещи");
                return ItemsToHold;
            } else if ((3 < HoldAbility) && (HoldAbility< 3*2+1)) {
                Human.setItems(ItemsToHold);
                super.setWhatActionsAreDone("прихватил вещи");
                return ItemsToHold;
            } else {
                Human.setItems(ItemsToHold);
                Human.setMood(Human.getMood()-0.5);
                return new Item[0];
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
