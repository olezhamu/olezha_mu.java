package Action;

import Boat.*;
import Item.*;

public class IsTransportating extends Action{
    public Boat Boat;

    public IsTransportating(Boat Boat) {
        super(Boat);
        this.Boat = Boat;
    }

    public String Transportation() throws InterruptedException {
        super.setWhatActionsAreDone("перевёз груз");
        Thread.sleep((1/Boat.getAgility())*10000);
        return Boat.getName() + " перевозит груз";
    }

    @Override
    public String getResult() {
        return Boat.getName() + " перевозит груз";
    }
}
