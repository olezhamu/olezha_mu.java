//User sleeps for 2 turns, but user is fully healed.
package Moves.lotad;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest(double power, double acc){
        super(Type.PSYCHIC, power, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().turns(2).condition(Status.SLEEP).attack((double)0.0F).stat(Stat.HP, 40);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
