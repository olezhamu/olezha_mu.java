//Quick Attack deals damage and has a priority of +1.
package Moves.sentret;

import ru.ifmo.se.pokemon.*;

public final class Quic_attack extends PhysicalMove {
    public Quic_attack(double power, double acc, int priority, int hits){
        super(Type.NORMAL, power, acc, priority, hits);
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
