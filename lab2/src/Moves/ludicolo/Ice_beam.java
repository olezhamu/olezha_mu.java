package Moves.ludicolo;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Ice_beam extends SpecialMove {
    public Ice_beam(double power, double acc){
        super(Type.ICE, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        double random = Math.random();
        if (random <= 0.1){
            Effect.freeze(p);
        }
    }

    @Override // переопределяем
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}