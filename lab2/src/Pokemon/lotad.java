package Pokemon;

import Moves.lotad.Rest;
import Moves.lotad.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class lotad extends Pokemon {
    public lotad(String name, int level){
        super(name, level);
        super.setType(Type.WATER, Type.GRASS);
        super.setStats(40, 30, 30, 40, 50, 30);

        Scald scald = new Scald(80, 100);
        super.setMove(scald);

        Rest rest = new Rest(0, 0);
        super.setMove(rest);
    }
}
