package Action;

import Boat.*;
import Human.*;
import Item.*;

public abstract class Action {
    public Human Human = null;
    public Boat Boat = null;
    public String WhatActionsAreDone = "";

    public Action(Human Human){
        this.Human = Human;
    }

    public Action(Boat Boat){
        this.Boat = Boat;
    }

    public abstract String getResult();

    public void setWhatActionsAreDone(String WhatActionsAreDone) {
        this.WhatActionsAreDone += WhatActionsAreDone + "; ";
    }

    public String getWhatActionsAreDone() {
        return "было сделано: " + WhatActionsAreDone;
    }
}