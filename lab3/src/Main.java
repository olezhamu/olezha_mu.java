import Action.*;
import Boat.*;
import Human.*;
import Item.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Item BagOfNails = new Bag("гвозди", "небольшой", "2 или 3", Weight.SMALL, "железный");
        Item Screw = new Item("отвертка", "небльшой", "1", Weight.SMALL, "железо");
        Item Axe = new Item("топор", "большой", "20", Weight.BIG, "дерево");
        Item Tochilo = new Item("точило", "небольлшой", "1", Weight.SMALL, "железо");

        Item Lom = new Item("лом", "средний", "3", Weight.MEDIUM, "железный");
        Item BagOfBullets = new Bag("пули", "средний", "2", Weight.MEDIUM, "железо");
        Item Musket = new Item("мушкет", "большой", "7", Weight.BIG, "железо");
        Item IgorsMusket = new Item("охотничье ружье", "средний", "1", Weight.MEDIUM, "железо");
        Item ChinaPowder = new Item("порох", "небольшой", "немного", Weight.SMALL, "порох");
        Item BagOfDrobь = new Bag("дробь", "большой", "1", Weight.MEDIUM, "железо");
        Item PlumbumSheet = new Item("сверток листового свинца", "большой", "1", Weight.ENORMOUSE, "свинец");

        Item Dress = new Item("платье", "средний", "все", Weight.MEDIUM, "ткань");
        Item ExtraSailingSheet = new Item("запасный парус", "большой", "1", Weight.BIG, "парусина");
        Item Gamak = new Item("гамак", "небольшой", "1", Weight.SMALL, "ткань");
        Item TuffiyakAndPillow = new Item("тюфяк и подушка", "средний", "несколько", Weight.MEDIUM, "ткань");

        Human I = new Human("Я", new ArrayList<Item>());
        Human PanStolar = new Human("Столяр", new ArrayList<Item>(Arrays.asList(BagOfNails, Screw, Axe, Tochilo)));
        Human KanonGuy = new Human("Канонир", new ArrayList<Item>(Arrays.asList(Lom, BagOfBullets, Musket, IgorsMusket, ChinaPowder, BagOfDrobь, PlumbumSheet)));

        Boat Raft = new IsBuildingBoat(I, "плот", 10, 10).BuildBoat();
        Boat OldRaft = new Boat("старый плот", 9, 9);

        Set Set = new Set(I, new ArrayList<Item>(Arrays.asList(BagOfNails, Lom)), Raft);

        new IsClimbing(I, "веревка", "корабль").Climb();

        if (OldRaft.getAgility() < Raft.getAgility()) {
            System.out.println("плот более поворотливый, чем предыдущий");
        } else {System.out.println("плот менее поворотливый, чем предыдущий");}

        Set.Hold();
        Set.Load();
        Set.Transport();
        Set.Unload();
    }
}