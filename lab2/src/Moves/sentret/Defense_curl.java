//Defense Curl raises the user's Defense by one stage.
package Moves.sentret;

import ru.ifmo.se.pokemon.*;

public final class Defense_curl extends StatusMove {
    public Defense_curl(double power, double acc){
        super(Type.NORMAL, power, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
