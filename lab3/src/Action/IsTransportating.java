package Action;

import Boat.*;
import Item.*;

public class IsTransportating extends Action{
    private Boat Boat;

    public IsTransportating(Boat Boat) {
        super(Boat);
        this.Boat = Boat;
    }

    public String Transportation() throws InterruptedException {
        super.setWhatActionsAreDone("перевёз груз");
        Thread.sleep((1/Boat.getAgility())*10000);
        System.out.println(Boat.getName() + " перевозит груз");
        return Boat.getName() + " перевозит груз";
    }

    @Override
    public String toString() {
        return Boat.getName() + " перевозит груз";
    }
}
