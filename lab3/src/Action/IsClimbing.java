package Action;

import Boat.Boat;
import Human.*;
import Item.Item;

public class IsClimbing extends Action{
    public Human Human;
    public String Object;
    public String Surface;

    public IsClimbing(Human Human, String Object, String Surface) {
        super(Human);
        this.Human = Human;
        this.Object = Object;
        this.Surface = Surface;
    }

    public String Climb() {
        Human.setMood(Human.getMood()+0.1);
        super.setWhatActionsAreDone("взобрался на " + Surface);
        return Human.getName() + " взбирается по " + Object + " на " + Surface;
    }

    @Override
    public String getResult() {
        return Human.getName() + " взбирается по " + Object + " на " + Surface;
    }
}
