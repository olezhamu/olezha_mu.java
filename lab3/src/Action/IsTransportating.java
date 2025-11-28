package Action;

import Boat.*;
import Item.*;

public class IsTransportating extends Action{
    public Boat Boat;

    public IsTransportating(Boat Boat) {
        super(Boat);
        this.Boat = Boat;
    }

    public String Transportation() {
        super.setWhatActionsAreDone("перевёз груз");
        return Boat.getName() + " перевозит груз";
    }

    @Override
    public String getResult() {
        return Boat.getName() + " перевозит груз";
    }
}
