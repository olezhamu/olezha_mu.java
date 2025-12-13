package Action;

import Boat.*;
import Human.*;
import Item.*;

public abstract class Action {
    private Human Human = null;
    private Boat Boat = null;
    private String WhatActionsAreDone = "";

    public Action(Human Human){
        this.Human = Human;
    }

    public Action(Boat Boat){
        this.Boat = Boat;
    }

    public abstract String toString();

    public void setWhatActionsAreDone(String WhatActionsAreDone) {
        this.WhatActionsAreDone += WhatActionsAreDone + "; ";
    }

    public String getWhatActionsAreDone() {
        return "было сделано: " + WhatActionsAreDone;
    }
}