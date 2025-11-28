package Pokemon;

import Moves.sentret.Defense_curl;
import Moves.sentret.Flamethrower;
import Moves.sentret.Quic_attack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class sentret extends Pokemon {
    public sentret(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(35, 46, 34, 35, 45, 20);

        Defense_curl defenseCurl = new Defense_curl(0, 0);
        super.setMove(defenseCurl);

        Quic_attack quicAttack = new Quic_attack(40, 100, 1, 0);
        super.setMove(quicAttack);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        super.setMove(flamethrower);
    }
}
