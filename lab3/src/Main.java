import Action.*;
import Boat.*;
import Human.*;
import Item.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Item Hammer = new Item("молоток", "небольшой", "1", "маленький", "дерево");
        Item BagOfNails = new Bag("гвозди", "небольшой", "2 или 3", "маленький", "железный");
        Item Lom = new Item("лом", "средний", "3", "средний", "железный");

        Human I = new Human("Я", new ArrayList<Item>());

        Boat Raft = new IsBuildingBoat(I, "плот", 10, 10).BuildBoat();
        Boat OldRaft = new Boat("старый плот", 9, 9);

        Set Set = new Set(I, new ArrayList<Item>(Arrays.asList(Hammer, BagOfNails, Lom)), Raft);

        System.out.println(new IsClimbing(I, "веревка", "корабль").Climb());

        if (OldRaft.getAgility() < Raft.getAgility()) {
            System.out.println("плот более поворотливый, чем предыдущий");
        } else {System.out.println("плот менее поворотливый, чем предыдущий");}

        Set.Hold();
        Set.Load();
        Set.Transport();
        Set.Unload();
    }
}