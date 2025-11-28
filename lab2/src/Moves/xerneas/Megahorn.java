//Megahorn deals damage with no additional effect.
package Moves.xerneas;

import ru.ifmo.se.pokemon.*;

public final class Megahorn extends PhysicalMove {
    public Megahorn(double power, double acc){
        super(Type.BUG, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, damage);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
