package Boat;

import Item.*;

public class Boat implements Sail{
    public String Name;
    public Integer Holdability;
    public Integer Agility;
    public Item[] Cargo;

    public Boat(String Name, Integer Agility, Integer HoldAbility){
        this.Name = Name;
        this.Holdability = HoldAbility;
        this.Agility = Agility;
    }

    public void setHoldability(Integer Holdability) {
        this.Holdability = Holdability;
    }

    public void setCargo(Item[] Cargo) {
        this.Cargo = Cargo;
    }

    public String Sinking() {
        return "судно тонет";
    }

    public String getName() {
        return Name;
    }

    public Integer getAgility() {
        return Agility;
    }

    public Integer getHoldability() {
        return Holdability;
    }

    public Item[] getCargo(){
        return Cargo;
    }

    @Override
    public String Sail() {
        return "судно идет под парусом";
    }
}