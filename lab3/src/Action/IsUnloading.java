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

    public String Unloading() {
        super.setWhatActionsAreDone(Boat.getName() + " разгружается");
        Boat.setCargo(new ArrayList<Item>(0));
        return Boat.getName() + " разжгужается";
    }

    @Override
    public String getResult() {
        return Boat.getName() + " разжгужается";
    }
}
