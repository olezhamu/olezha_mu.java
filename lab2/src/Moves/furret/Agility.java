//Agility raises the user's Speed by two stages.
package Moves.furret;

import ru.ifmo.se.pokemon.*;

public final class Agility extends StatusMove {
    public Agility(double power, double acc){
        super(Type.PSYCHIC, power, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPEED, 2);
        p.addEffect(e);
    }

    @Override // переопределяем
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}