package Boat;

import Item.*;

public class Raft extends Boat{
    /*
    public String Name;
    public Integer Holdability;
    public Integer Agility;
     */

    public Raft(String Name, Integer Agility, Integer HoldAbility) {
        super(Name, Agility, HoldAbility);
    }

    @Override
    public String Sinking() {
        return "плот тонет";
    }
}
