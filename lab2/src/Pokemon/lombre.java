package Pokemon;

import Moves.lombre.Hydro_pump;
import ru.ifmo.se.pokemon.Type;

public class lombre extends lotad{
    public lombre(String name, int level){
        super(name, level);
        super.setType(Type.WATER, Type.GRASS);
        super.setStats(60, 50, 50, 60, 70, 50);

        Hydro_pump hydro_pump = new Hydro_pump(110, 80);
        addMove(hydro_pump);
    }
}
