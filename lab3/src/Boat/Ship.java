package Boat;

import Item.*;

public class Ship extends Boat{
    /*
    public String Name;
    public Integer Holdability;
    public Integer Agility;
     */

    public Ship(String Name, Integer Agility, Integer HoldAbility) {
        super(Name, Agility, HoldAbility);
    }

    @Override
    public String Sinking() {
        return "корабль тонет";
    }
}
