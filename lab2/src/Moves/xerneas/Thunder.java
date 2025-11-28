//Thunder deals damage and has a 30% chance of paralyzing the target.
package Moves.xerneas;

import ru.ifmo.se.pokemon.*;

public final class Thunder extends SpecialMove {
    public Thunder(double power, double acc){
        super(Type.ELECTRIC, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        double random = Math.random();
        if (random <= 0.3){
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
