package Pokemon;

import Moves.xerneas.Double_team;
import Moves.xerneas.Focus_blast;
import Moves.xerneas.Megahorn;
import Moves.xerneas.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final class xerneas extends Pokemon{
    private xerneas(String name, int level) {
        super(name, level);
        super.setType(Type.FAIRY);
        super.setStats(126, 131, 95, 131, 98, 99);

        Focus_blast focusBlast = new Focus_blast(120, 70);
        super.setMove(focusBlast);

        Double_team doubleTeam = new Double_team(0, 0);
        super.setMove(doubleTeam);

        Megahorn megahorn = new Megahorn(120, 85);
        super.setMove(megahorn);

        Thunder thunder = new Thunder(110, 70);
        super.setMove(thunder);
    }
}