import Action.*;
import Boat.*;
import Human.*;
import Item.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Item BagOfNails = new Bag("гвозди", "небольшой", "2 или 3", "маленький", "железный");
        Item Screw = new Item("отвертка", "небльшой", "1", "маленький", "железо");
        Item Axe = new Item("топор", "большой", "20", "большой", "дерево");
        Item Tochilo = new Item("точило", "небольлшой", "1", "маленький", "железо");

        Item Lom = new Item("лом", "средний", "3", "средний", "железный");
        Item BagOfBullets = new Bag("пули", "средний", "2", "средний", "железо");
        Item Musket = new Item("мушкет", "большой", "7", "большой", "железо");
        Item IgorsMusket = new Item("охотничье ружье", "средний", "1", "средний", "железо");
        Item ChinaPowder = new Item("порох", "небольшой", "немного", "маленький", "порох");
        Item BagOfDrobь = new Bag("дробь", "большой", "1", "средний", "железо");
        Item PlumbumSheet = new Item("сверток листового свинца", "большой", "1", "очень большой", "свинец");

        Item Dress = new Item("платье", "средний", "все", "средний", "ткань");
        Item ExtraSailingSheet = new Item("запасный парус", "большой", "1", "большой", "парусина");
        Item Gamak = new Item("гамак", "небольшой", "1", "маленький", "ткань");
        Item TuffiyakAndPillow = new Item("тюфяк и подушка", "средний", "несколько", "средний", "ткань");

        Human I = new Human("Я", new ArrayList<Item>());
        Human PanStolar = new Human("Столяр", new ArrayList<Item>(Arrays.asList(BagOfNails, Screw, Axe, Tochilo)));
        Human KanonGuy = new Human("Канонир", new ArrayList<Item>(Arrays.asList(Lom, BagOfBullets, Musket, IgorsMusket, ChinaPowder, BagOfDrobь, PlumbumSheet)));

        Boat Raft = new IsBuildingBoat(I, "плот", 10, 10).BuildBoat();
        Boat OldRaft = new Boat("старый плот", 9, 9);

        Set Set = new Set(I, new ArrayList<Item>(Arrays.asList(BagOfNails, Lom)), Raft);

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