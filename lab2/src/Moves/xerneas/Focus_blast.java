//Focus Blast deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
package Moves.xerneas;
import ru.ifmo.se.pokemon.*;

public final class Focus_blast extends SpecialMove {
    public Focus_blast(double power, double acc){
        super(Type.FIGHTING, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
