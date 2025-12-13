package Boat;

import Item.*;

import java.util.ArrayList;

public class Boat implements Sail{
    private String Name;
    private Integer Holdability;
    private Integer Agility;
    private ArrayList<Item> Cargo = new ArrayList<Item>(0);

    public Boat(String Name, Integer Agility, Integer HoldAbility){
        this.Name = Name;
        this.Holdability = HoldAbility;
        this.Agility = Agility;
    }

    public void setCargo(ArrayList<Item> Cargo) {
        this.Cargo = Cargo;
    }

    public String Sinking() {
        return "судно тонет";
    }

    public String getName() {
        String s = Name;
        return s;
    }

    public Integer getAgility() {
        Integer s = Agility;
        return s;
    }

    public Integer getHoldability() {
        Integer s = Holdability;
        return s;
    }

    public ArrayList<Item> getCargo(){
        ArrayList<Item> s = Cargo;
        return s;
    }

    @Override
    public String Sail() {
        return "судно идет под парусом";
    }
}