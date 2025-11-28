package Action;

import Boat.*;
import Human.*;
import Item.*;

public class IsBuildingBoat extends Action{
    public Human Human;
    public String Name;
    public Integer Agility;
    public Integer HoldAbility;

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
        switch (Name) {
            case "судно" -> {return new Boat(Name, Agility, HoldAbility);}
            case "корабль" -> {return new Ship(Name, Agility, HoldAbility);}
            case "плот" -> {return new Raft(Name, Agility, HoldAbility);}
        }
        return new Boat(Name, Agility, HoldAbility);
    }

    @Override
    public String getResult() {
        String s = Human.getName() + " построил " + Name;
        return s;
    }
}