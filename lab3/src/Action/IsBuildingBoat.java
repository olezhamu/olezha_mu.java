package Action;

import Boat.*;
import Human.*;
import Item.*;

public class IsBuildingBoat extends Action{
    private Human Human;
    private String Name;
    private Integer Agility;
    private Integer HoldAbility;

    public IsBuildingBoat(Human Human, String Name, Integer Agility, Integer HoldAbility) {
        super(Human);
        this.Human = Human;
        this.Name = Name;
        this.Agility = Agility;
        this.HoldAbility = HoldAbility;
    }

    public Boat BuildBoat() {
        System.out.println(Human.getName() + " построил " + Name);
        Human.setMood(Human.getMood()+1.0);
        super.setWhatActionsAreDone("построен/а/о " + Name);
        return new Boat(Name, Agility, HoldAbility);
    }

    @Override
    public String getResult() {
        String s = Human.getName() + " построил " + Name;
        return s;
    }
}