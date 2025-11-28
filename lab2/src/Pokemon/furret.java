package Pokemon;

import Moves.furret.Agility;
import ru.ifmo.se.pokemon.Type;

final class furret extends sentret{
    private furret(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(35, 46, 34, 35, 45, 20);

        Agility agility = new Agility(0, 0);
        addMove(agility);
    }
}