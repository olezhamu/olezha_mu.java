package Action;

import Boat.*;
import Human.*;
import Item.Item;

import java.util.ArrayList;

public class IsUnloading extends Action{
    private Human Human;
    private Boat Boat;

    public IsUnloading(Human Human, Boat Boat) {
        super(Boat);
        this.Human = Human;
        this.Boat = Boat;
    }

    public String Unloading() throws InterruptedException {
        super.setWhatActionsAreDone(Boat.getName() + " разгружается");
        System.out.print(Human.getName() + " разгрузил ");
        Thread.sleep(1000);
        for (Item Item : Boat.getCargo()) {
            switch (Item.getWeight()) {
                case "маленький" -> {Thread.sleep(5000);System.out.print(Item.getMany() + " " + Item.getName() + ", ");}
                case "средний" -> {Thread.sleep(7500);System.out.print(Item.getMany() + " " + Item.getName() + ", ");}
                case "большой" -> {Thread.sleep(10000);System.out.print(Item.getMany() + " " + Item.getName() + ", ");}
            }
        }
        Boat.setCargo(new ArrayList<Item>(0));
        return Boat.getName() + " разжгужается";
    }

    @Override
    public String toString() {
        return Boat.getName() + " разжгужается";
    }
}
