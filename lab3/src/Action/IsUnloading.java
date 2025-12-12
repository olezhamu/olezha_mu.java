package Action;

import Boat.*;
import Human.*;
import Item.Item;

import java.util.ArrayList;

public class IsUnloading extends Action{
    private Boat Boat;

    public IsUnloading(Boat Boat) {
        super(Boat);
        this.Boat = Boat;
    }

    public String Unloading() throws InterruptedException {
        super.setWhatActionsAreDone(Boat.getName() + " разгружается");
        Thread.sleep(1000);
        for (Item Item : Boat.getCargo()) {
            switch (Item.getWeight()) {
                case "маленький" -> {Thread.sleep(5000);}
                case "средний" -> {Thread.sleep(7500);}
                case "большой" -> {Thread.sleep(10000);}
            }
        }
        Boat.setCargo(new ArrayList<Item>(0));
        return Boat.getName() + " разжгужается";
    }

    @Override
    public String getResult() {
        return Boat.getName() + " разжгужается";
    }
}
