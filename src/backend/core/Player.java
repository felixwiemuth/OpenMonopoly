/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.core;

import backend.board.PlanElement;
import java.util.ArrayList;

/**
 * The OpenMonopoly player.
 *
 * @author Felix Wiemuth
 */
public class Player {

    private String name;
    private int money;
    private ArrayList<PlanElement> property;

    public Player(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
