import Action.*;
import Boat.*;
import Human.*;
import Item.*;

public class Main {
    public static void main(String[] args){
        /*
        System.out.println(Hammer.getMany());
        System.out.println(BagOfNails.getName());
        System.out.println(I.getItems());
        System.out.println(new IsHolding(I,new Item[] {Hammer, BagOfNails, Lom}).Hold());
        System.out.println(new IsHoldingSoftly(I,new Item[] {Hammer, BagOfNails, Lom} ).Hold());
         */
        Item Hammer = new Item("молоток", "небольшой", "1", "маленький", "дерево");
        Item BagOfNails = new Bag("гвозди", "небольшой", "2 или 3", "маленький", "железный");
        Item Lom = new Item("лом", "средний", "3", "средний", "железный");
        Human I = new Human("Я", new Item[0]);
        System.out.println(new IsClimbing(I, "веревка", "корабль").Climb());
        Boat Raft = new IsBuildingBoat(I, "плот", 10, 10).BuildBoat();
        Raft OldRaft = new Raft("старый плот", 9, 9);
        if (OldRaft.getAgility() < Raft.getAgility()) {
            System.out.println("плот более поворотливый, чем предыдущий");
        } else {System.out.println("плот менее поворотливый, чем предыдущий");}
        Item[] Hold = new IsHolding(I, new Item[] {Hammer, BagOfNails, Lom}).Hold();
        System.out.println(Hold);
    }
}