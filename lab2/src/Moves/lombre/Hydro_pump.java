//Hydro Pump deals damage with no additional effect.
package Moves.lombre;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Hydro_pump extends SpecialMove {
    public Hydro_pump(double power, double acc){
        super(Type.WATER, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, damage);
    }
}
