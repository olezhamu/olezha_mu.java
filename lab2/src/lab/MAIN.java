package lab;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class MAIN {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("furret", 1);
        Pokemon p2 = new Pokemon("lombre", 1);
        Pokemon p3 = new Pokemon("lotad", 1);
        Pokemon p4 = new Pokemon("ludicolo", 1);
        Pokemon p5 = new Pokemon("sentret", 1);
        Pokemon p6 = new Pokemon("xerneas", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
