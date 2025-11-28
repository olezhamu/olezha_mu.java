//Double Team raises the user's Evasiveness by one stage, thus making the user more difficult to hit.
package Moves.xerneas;

import ru.ifmo.se.pokemon.*;

public final class Double_team extends StatusMove{
    public Double_team(double power, double acc){
        super(Type.NORMAL, power, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
