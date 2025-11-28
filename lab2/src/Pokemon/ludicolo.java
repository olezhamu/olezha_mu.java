package Pokemon;

import Moves.ludicolo.Ice_beam;
import ru.ifmo.se.pokemon.Type;

final class ludicolo extends lombre{
    private ludicolo(String name, int level){
        super(name, level);
        super.setType(Type.WATER, Type.GRASS);
        super.setStats(80, 70, 70, 90, 100, 70);

        Ice_beam ice_beam = new Ice_beam(90, 100);
        addMove(ice_beam);
    }
}
