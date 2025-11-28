//Flamethrower deals damage and has a 10% chance of burning the target.
package Moves.sentret;

import ru.ifmo.se.pokemon.*;

public final class Flamethrower extends SpecialMove {
    public  Flamethrower(double power, double acc) {
        super(Type.FIRE, power, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        double random = Math.random();
        if (random <= 0.1){
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}